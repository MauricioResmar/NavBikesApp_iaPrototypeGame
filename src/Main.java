//>×OWTO> NAVBIKE Clone System Versión 1.1  - Prototype Pattern

public class Main {

    public static void main(String[] args) {

        // Instanciamos la Clase tipo: Objeto (Prototypo)
        NavBike navbike = new NavBike();

        // Instanciamos datanavbik3 para obtener los datos vía Scanner()
        Datanavbik3 datanavbik3 = new Datanavbik3();

        // Inicializamos e inicializamos la Variable Id
        int id = 1;

        //Inicializamos y asignamos variable para el prototypo
        navbike.powerForce = 1;

        //Inicio - bienvenida del usuario al sistema NavBike 1.0
        IconNavBike iconNavBike = new IconNavBike();
        iconNavBike.GetWelcomeInterfaz();

        //Imprime en pantalla las imagenes / iconos de nuestras NavBikes:

        iconNavBike.GetAllIconsNavBikes();
        iconNavBike.GetIconHackerNavBike();

        //Inicializamos y asignamos valores para el tipo de NavBike Prototypo a ser creada
        navbike.typeNavbik3 = datanavbik3.GetTypeNavbike();

        //Inicializamos y asignamos valores para la IaVersion y el Color de la NavBike
        navbike.versionIa = datanavbik3.GetVersionIa(); //Definir los tipos de ia y el sistema de seleccion en datanavbik3.java
        navbike.color = datanavbik3.GetColorNavBike();

        //Imprime en pantalla nuestro Objeto Prototypo

        System.out.println("Memory ram path object: " + navbike);
        System.out.println("data id navbike: " + id);
        System.out.println("data type navbik3: " + navbike.typeNavbik3);
        System.out.println("ia version: " + navbike.versionIa);
        System.out.println("color navbike: " + navbike.color);
        System.out.println("powerforce navbike: " + navbike.powerForce);

        //Metodo constructor PrintIconNavBike: Imprime el tipo de NavBike seleccionado por el usuario.

        iconNavBike.PrintIconNavBike(navbike.typeNavbik3);

        //Obtenemos la cantidad de Clones a crear vía Scanner()

        int numClones = datanavbik3.GetNumClones();
        int numShips = numClones;

        // Crea e imprime los objetos Clonados mientras numClones sea mayor a Cero (0)
        do {
            try {
                NavBike clonado = navbike.clonar();
                //int clon = clonado.id;
                numClones = numClones - 1;

                System.out.println("\nmem path clone: " + clonado);
                System.out.println("id clone: " + id);
                System.out.println("type navbike clone: " + clonado.typeNavbik3);
                System.out.println("ia version clone: " + clonado.versionIa);
                System.out.println("color navbike clone: " + clonado.color);
                System.out.println("powerforce navbike clone: " + clonado.powerForce + "\n");

                //Imprime el tipo de NavBike seleccionado por el usuario:
                iconNavBike.PrintIconNavBike(navbike.typeNavbik3);

            } catch (CloneNotSupportedException e) {
                System.out.println("El objeto no puede ser Clonado: " + e.getMessage());
            }
            id = id + 1;
        } while (numClones > 0);

        System.out.println("\nCantidad de NavBikes (Clonados) en tu flota: " + numShips);

        //Realizamos la impresión en pantalla de toda la flota NavBikes Creada

        for (int i = 0; i < numShips; i++) {
            iconNavBike.PrintIconNavBike(navbike.typeNavbik3);
        }
    }
}