import java.util.Scanner;
public class Datanavbik3 {
    Scanner scanner = new Scanner(System.in);
    int numClones;
    public String GetTypeNavbike() {

        int numType;
        String typeNavbike;
        do {
            System.out.println("\nIngresa el tipo de navbike a crear: 1).'Tactical' 2).'Heavy', 3).'Hacker': ");

            numType = scanner.nextInt();
            typeNavbike = null;

            switch (numType) {
                case 1:
                    typeNavbike = "Tactical";
                    break;
                case 2:
                    typeNavbike = "Heavy";
                    break;
                case 3:
                    typeNavbike = "Hacker";
                    break;
                default:
                    System.out.println("Tipo de NavBike no valido, intentelo de nuevo");
            }
        } while (numType != 1 && numType != 2 && numType != 3);

        return typeNavbike;
    }
    public String GetVersionIa(){
     int typeIa;
     String versionIa = null;

     System.out.println("Elige la ia a incorporar en tu NavBike");
     System.out.println("1).'NavBikeiaM1.0' Asistente de voz Masculina.");
     System.out.println("2).'NavBikeiaF1.0' Asistente de voz Femenina.");
     typeIa =  scanner.nextInt();

     do {
      switch (typeIa) {
          case (1):
              versionIa = "NavBikeiaM1.0";
              break;
          case (2):
              versionIa = "NavBikeiaF1.0";
              break;
          default:
              System.out.println("El valor ingresado no corresponde a una opcion valida, intentalo de nuevo!");
      }
     } while (typeIa != 1 && typeIa !=2);
        return versionIa;
    }
    public String GetColorNavBike(){
     System.out.println("Ingresa manualmente un Color adecuado para tu NavBike por favor: ");
     String colorNavbike =  scanner.next();
        return colorNavbike;
    }
    public int GetNumClones(){
     System.out.println("¿Cuantos clones de este tipo de NavBike requieres Crear?: ");
     int numClonesSet =  scanner.nextInt();
        return numClonesSet;
    }
}