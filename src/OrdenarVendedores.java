// ejercicio 1 sumativa 3 .cpp : Programa que Muestra una lista de vendedores y la ordena. Por: Josmar Osorio. Para: Programación II-UBA.

import java.util.ArrayList;//Importamos la libreria Arraylist para poder trabajar con Arraylist.
class Vendedor {//Creamos la clase vendedor.

    private final String nombre;//Creamos la variable nombre.
    private final int ventas;//Vtramos la variable ventas.
    public Vendedor(String nombre, int ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
    }
    public int getVentas() {
        return ventas;
    }

    public String toString() {//Creamos un metodo para mostar el nombre y las ventas del vendedor.
        return "Vendedor: " + nombre + ", ventas: " + ventas +  "$";
    }
}

public class OrdenarVendedores {//Creamos una clase para ordenar los vendedores.

    public static void main(String[] args) {
        ArrayList<Vendedor> vendedores = new ArrayList<>();//Creamos un arraylist para almacenar los datos de los vendedores.
        vendedores.add(new Vendedor("Juan", 100));
        vendedores.add(new Vendedor("Pedro", 200));
        vendedores.add(new Vendedor("Lucas", 50));

        System.out.println("Antes de ordenar:");
        for (Vendedor vendedor : vendedores) {//Creamos un ciclo for para mostar los datos del array, es decir, los vendedores.
            System.out.println(vendedor);
        }

        vendedores.sort((v1, v2) -> v2.getVentas() - v1.getVentas());//Utilizamos la funcion sort para ordenar el array de forma ascendente.

        System.out.println("\nDespués de ordenar:");
        for (Vendedor vendedor : vendedores) {//Creamos un ciclo for para mostar el array ya ordenado.
            System.out.println(vendedor);
        }
    }
}


