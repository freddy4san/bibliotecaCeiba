(function () {
    'use strict';

    angular.module('app.biblioteca').factory('bibliotecaService', serviciosBiblioteca);

    function librosService($http) {

        var servicios = {
            serviciosListaLibros: serviciosListaLibros
        };

        return servicios;

    }

    function serviciosListaLibros() {
        return $http({
            method: 'GET',
            url: '',
        }).then(function (response) {
            return response.data;
        }).catch(function (data) {
            throw data;
        });
    }
})();