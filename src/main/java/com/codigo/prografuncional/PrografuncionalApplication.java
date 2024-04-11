package com.codigo.prografuncional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class PrografuncionalApplication {

	public static void main(String[] args) {

		SpringApplication.run(PrografuncionalApplication.class, args);
		//FORMA FUNCIONAL
		//Lista de String
		List<String> lstmarcas = List.of("Mazda","Toyota","Nissan","Chevrolet","Jetour","Subaru","Tesla");
		//SE CONSUME LA LISTA PARA IMPRIMIR TODOS SUS VALORES
		//lista marca. hacer un for. marca(referencia a un elemnto, imprimir marca

		//lstmarcas.forEach( marca -> System.out.println(marca));

		//Forma FORMAL
		/*
		for (int i=0; i< marcas.size(); i++){
			System.out.println("Marcas de Carro:" + marcas.get(i));
		}
		 */

		//STREAMS
		//convertimos nuestra lista a un STREAM
		//valor antes de la flecha es un predicado cuando usamos un filter
		//map es operaciones de un stream(convierte a un flujo de dato) por ello es considerado como metodos intermedios
		//collect:
		List<String> marcasFiltradas = lstmarcas.stream() //convertir la lista a un Stream
				.filter( marca -> marca.startsWith("T"))//Filtrando a travez de predicate todos los elementos que inicien con t
				.map(String::toUpperCase)//convertir todos los elementos de la coelccion a mayusculas con una funcion
				.collect(Collectors.toList());//recolectamos los resultados en otra lista

		marcasFiltradas.forEach( System.out::println); //imprimo los calores de mi lista filtrada

		//Forma FORMAL

		List<String> valoresfiltrados = new ArrayList<>();
		/* //nuevo for
			for (String nombre : lstMarcas){
			}
		*/
		for (int i=0; i< lstmarcas.size(); i++){
			if (lstmarcas.get(i).startsWith("T")){
				valoresfiltrados.add(lstmarcas.get(i).toUpperCase());
			}
		}
		for (int i=0; i< valoresfiltrados.size(); i++){
			System.out.println("Valores Filtrados:" + valoresfiltrados.get(i));
		}

	}

}
