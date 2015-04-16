
function controlador($scope, $http) {
    $scope.formData= {};
	$scope.tiposJedi = [{tipo:'Padawan', tarifa:25},{tipo:'Jedi', tarifa:33},{tipo:'Maestro Jedi', tarifa:45}];
	
	//Creamos la función initFirst para llamar al get de los datos cuando queramos
	$scope.initFirst=function(){
		$http.get('/tareas').
        success(function(data) {
        	$scope.datosInforme = data;
        });
		if(angular.isDefined($scope.tipo)){
		    delete $scope.tipo;
		}
	 };
	
    $scope.guardarTarea = function(){
    	$scope.formData.tarifa = Number(document.getElementById('inputTarifa').value);
    	$http.post('/tareas',$scope.formData)
    		.success(function(data){
    			//Vaciamos el formulario
    			$scope.formData = {};
    			
    			//Recargamos los datos
    			$scope.initFirst();
    		})
    		.error(function(data){
    			console.log(data);
    			alert('Existe un error en los datos del formulario');
    		});
    }   

    $scope.precioPorEmpresa = function(list){
		var total = 0;
		for(count=0;count<list.length;count++){
			total += list[count].horas*list[count].tarifa;
		}
		return total;
	}
    
    $scope.horasTotales = function(list){
		var total = 0;
		for(count=0;count<list.length;count++){
			total += list[count].horas;
		}
		return total;
	}

    $scope.updTarifa = function(){
    	$scope.formData.tipo = $scope.tipo.tipo;
    	$scope.formData.tarifa = $scope.tipo.tarifa;
    }

}

