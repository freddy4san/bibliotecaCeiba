package com.springboot.rest.biblioteca.springboot2restservicebasic.utilidades;

import java.util.Calendar;
import java.util.Date;

import com.springboot.rest.biblioteca.springboot2restservicebasic.LibroEntity;

import dominio.Libro;
import dominio.Prestamo;
import dominio.excepcion.PrestamoException;
import dominio.repositorio.RepositorioLibro;
import dominio.repositorio.RepositorioPrestamo;

public class biblioteca {
	
	

	private Object repositorioPrestamo;

	public void prestar(String isbn, String nombreUsuario) {

		boolean espalindromo = esPalindromo(isbn);
		boolean esprestado = esPrestado(isbn);
		boolean fechaMaximaEstado = fechaMaxima(isbn);

		Date fechaMaxima = null, fechaInicial = null;

		Libro libro = repositorioLibro.obtenerPorIsbn(isbn);
		if (libro != null) {
			if (espalindromo) {
				throw new PrestamoException(LIBRO_PALINDROMO);
			} else {
				if (esprestado) {
					throw new PrestamoException(EL_LIBRO_NO_SE_ENCUENTRA_DISPONIBLE);
				} else {
					fechaInicial = new Date();
					if (fechaMaximaEstado) {
						fechaMaxima = fechaMaximaEntrega(fechaInicial);
					}
					Prestamo prestamo = new Prestamo(fechaInicial, libro, fechaMaxima, nombreUsuario);
					repositorioPrestamo.agregar(prestamo);
				}
			}
		} else {
			throw new PrestamoException("LIBRO_NO_EXISTE");
		}

	}

	public boolean esPrestado(String isbn) {
		Libro libro = repositorioPrestamo.obtenerLibroPrestadoPorIsbn(isbn);
		if (libro != null) {
			return true;
		} else {
			return false;
		}
	}
	

	public boolean esPalindromo(String isbn) {
		String isbnInvertido = "";
		// Recorrer y ordernar isbn de derecha a izquierda
		for (int i = isbn.length() - 1; i >= 0; i--) {
			isbnInvertido = isbnInvertido + isbn.charAt(i);
		}
		// Comparar isbn e isbnInvertido
		if (isbnInvertido.equals(isbn)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean fechaMaxima(String isbn) {
		int sumadigitos = 0;
		for (int i = 0; i < isbn.length(); i++) {
			if (Character.isDigit(isbn.charAt(i))) {
				sumadigitos += Character.getNumericValue(isbn.charAt(i));
			}
		}
		if (sumadigitos > 30) {
			return true;
		} else {
			return false;
		}
	}

	public Date fechaMaximaEntrega(Date fechaInicial) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fechaInicial); // Lunes 1 mayo

		int dias = 1;

		while (dias < 15) {
			int dayWeek = calendar.get(Calendar.DAY_OF_WEEK); // mier
			if (dayWeek != Calendar.SUNDAY) {
				dias = dias + 1; // =15
			}
			calendar.add(Calendar.DAY_OF_MONTH, 1); // j 18 mayo
		}
		return calendar.getTime();
	}

}
