package proyectofinal;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoFinal {

    private static String cadenaAleatoria = "";
    int cantidadUsuarios = 1000;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        
        //////
        boolean l2 = false;
        do{
            String nombreArchivo = "usuarios.txt";  
            File archivo = new File(nombreArchivo);
            if (archivo.exists ()) {
                File inputFile = new File("usuarios.txt");
                File tempFile = new File("tempo.txt");
                try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] parts = line.split("\\|");
                        if (parts.length >= 4 && parts[4].equals(Integer.toString(1))) {
                            l2=true;
                        }                      
                        writer.write(line + "\n");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
                }          
            }else {
                boolean v = true;
                ProyectoFinal proyecto = new ProyectoFinal(); // Crear una instancia de la clase
                v=proyecto.contraseniaa(v);// Llamar al método contraseniaa en la instancia
                if (v == true){
                    ProyectoFinal proyecto2 = new ProyectoFinal(); // Crear una instancia de la clase
                    proyecto2.registroUsusarios();  // Llamar al método contraseniaa en la instancia
                 }
            }            
        }while(l2 == false);

                
                
        
        
        
        ///////
        
        while (true){
            System.out.println("-------SISTEMA DE VOTACIONES------- ");
            System.out.println("Ingresar Como: 1)Usuario 2)Votante");
            int ll = scanner.nextInt();
            if (ll == 1){
                System.out.println("Ingrese Correo Electronico: ");
                String correo3 = scanner.next();
                int n=0;
                System.out.println("Contraseña: ");
                String contra3 = scanner.next();
                ProyectoFinal proyecto11= new ProyectoFinal(); // Crear una instancia de la clase
                n = proyecto11.contraInicio(correo3,contra3,n);// Llamar al método contraseniaa en la instancia

                int opcion;
                opcion = n;

                boolean c = true;           
                while (c == true) {
                    
             //   System.out.println("Iniciar secion como: ");
             //   System.out.println("1)Administrador \n2)Registrador de Votantes \n3)votante \n4)Auditor \n5)Salir");

                    switch (opcion) {

                        case 1:

                            boolean a = true;
                            ProyectoFinal proyecto = new ProyectoFinal(); // Crear una instancia de la clase
                            a=proyecto.contraseniaa(a);// Llamar al método contraseniaa en la instancia

                            while (a==true) {
                                System.out.println("----------BIENVENIDO---------");
                                System.out.println("1)Registro de usuarios 2)Administracion De Elecciones 3)dkd  4) hi ");
                                int opcion4 = scanner.nextInt();
                                switch(opcion4){

                                    case 1:
                                        boolean j=true;
                                        while (j==true) {
                                            System.out.println("Registro de usuarios ");
                                            System.out.println("1)Crear usuario Del Sistema \n2)modificar Uusario del Sistema \n3)Reiniciar contrasenia\n4)Salir");
                                            int opcion2 = scanner.nextInt();
                                            switch (opcion2) {
                                                case 1:
                                                ProyectoFinal proyecto2 = new ProyectoFinal(); // Crear una instancia de la clase
                                                proyecto2.registroUsusarios();  // Llamar al método contraseniaa en la instancia
                                                break;
                                            case 2:
                                                ProyectoFinal proyecto4= new ProyectoFinal(); // Crear una instancia de la clase
                                                proyecto4.modificarUsuario();  // Llamar al método contraseniaa en la instancia

                                                break;
                                            case 3:
                                                ProyectoFinal proyecto3 = new ProyectoFinal(); // Crear una instancia de la clase
                                                proyecto3.usuaContra();  // Llamar al método contraseniaa en la instancia

                                                break;
                                            case 4:
                                                j = false;
                                                break;
                                            }                            
                                         }
                                        break;


                                    case 2:

                                        boolean k = true;
                                        while (k == true){
                                            System.out.println("Administracion De Elecciones  ");
                                            System.out.println("1)Gestionar Elecciones  \n2)Gestionar Candidatos \n3)Configurar Opcion De eleccion \n4)Salir");
                                            int opcion3 = scanner.nextInt();
                                            switch(opcion3){
                                                case 1:

                                                    break;

                                                case 2:

                                                    break;

                                                case 3:

                                                    break;
                                            }
                                         }

                                         break;
                                    case 3:
                                      
                                        break;
                                        
                                        
                                    case 4:
                                      a =false;
                                      c= false;
                                        break;

                                 }


                             }
                             break;


                        case 2:
                            boolean b = true;
                            System.out.println("Enter para iniciar como registrador de votantes ");
                            scanner.nextLine();
                            scanner.nextLine();
                            while (b == true) {
                                System.out.println("---------Registro de Votantes---------");
                                System.out.println("1)Agregar Votante \n2)Modificar Votante \n3)Reiniciar contrasenia votante \n4)Registrar Fallecimiento Votante \n5)Salir");
                                int opcion3 = scanner.nextInt();
                                    switch (opcion3) {
                                        case 1:
                                            ProyectoFinal proyecto2 = new ProyectoFinal(); // Crear una instancia de la clase
                                            proyecto2.registroVotantes();// Llamar al método contraseniaa en la instancia
                                            break;
                                        case 2:
                                            ProyectoFinal proyecto3 = new ProyectoFinal(); // Crear una instancia de la clase
                                            proyecto3.modificarVotante();// Llamar al método contraseniaa en la instancia
                                            break;
                                        case 3:
                                            ProyectoFinal proyecto4 = new ProyectoFinal(); // Crear una instancia de la clase
                                            proyecto4.reiniContrVotante();// Llamar al método contraseniaa en la instancia

                                            break;
                                        case 4:
                                            ProyectoFinal proyecto5 = new ProyectoFinal(); // Crear una instancia de la clase
                                            proyecto5.registFalleVotante();// Llamar al método contraseniaa en la instancia
                                            break;
                                        case 5:
                                            b = false;
                                            c = false;
                                            break;
                                    }
                            }
                            break;


                        case 3:
                            
                            //reportes
                            

                            break;
                                         
                     }
                 }


            }else if (ll == 2){
               boolean t = true;
                            ProyectoFinal proyecto7 = new ProyectoFinal(); // Crear una instancia de la clase
                            System.out.print("Ingrese NIT: ");
                            scanner.nextLine();
                            String nit3 = scanner.nextLine();
                            System.out.print("Ingrese contrasenia: ");
                            String contrasenia3 = scanner.nextLine();
                            t = proyecto7.contraVotantes (nit3, contrasenia3, t);  // Llamar al método contraseniaa en la instancia
                            while (t==true){



                            }


            }else{
                System.out.println("Opcion Incorrecta");

            }
         }
    }

    
    boolean contraseniaa(boolean a) {
        Scanner scanner = new Scanner(System.in);
        String passwordFile = "admin_password.txt";
        // Verificar si el archivo de contraseña ya existe
        File file = new File(passwordFile);
        if (file.exists()) {
            System.out.println("Bienvenido al sistema.");
        } else {
            // El archivo de contraseña no existe, solicitar una nueva contraseña.
            System.out.print("Configuracion inicial: \nPor favor, ingrese una contrasenia para el usuario administrador: ");
            String newPassword = scanner.nextLine();

            // Guardar la contraseña en el archivo
            try {
                try (FileWriter writer = new FileWriter(passwordFile)) {
                    writer.write(newPassword);
                }
                System.out.println("Contraseña configurada con éxito.");
            } catch (IOException e) {
                System.err.println("Error al guardar la contraseña.");
            }
        }

        // Ahora, puedes solicitar la contraseña al usuario e verificarla cada vez que sea necesario.
        System.out.print("Ingrese la contrasenia del usuario administrador: ");
        String enteredPassword = scanner.nextLine();

        // Leer la contraseña almacenada en el archivo
        String storedPassword = readPasswordFromFile(passwordFile);

        // Verificar si la contraseña ingresada coincide con la almacenada
        if (enteredPassword.equals(storedPassword)) {
            System.out.println("Contrasenia Correcta");
            // Aquí puedes continuar con las operaciones del programa.
            System.out.print("\033[H\033[2J");
            System.out.flush();

        } else {
            System.out.println("Contraseña incorrecta. Saliendo del programa.");
            a=false;
        }
    return a;
    }

    private static String readPasswordFromFile(String filename) {
        try {
            String password;
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                password = reader.readLine();
            }
            return password;
        } catch (IOException e) {
            System.err.println("Error al leer la contraseña.");
            return null;
        }
    }

    void registroUsusarios() {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[cantidadUsuarios];
        String[] apellidos = new String[cantidadUsuarios];
        String[] correosElectronicos = new String[cantidadUsuarios];
        String[] contrasenias = new String[cantidadUsuarios];
        int[] roles = new int[cantidadUsuarios];
        boolean[] estado = new boolean[cantidadUsuarios];
        File f = new File("usuarios.txt"); // Archivo creado 
        System.out.println("\nRegistro De Usuarios  ");
        System.out.print("Ingresed Nombres: ");
        nombres[0] = scanner.nextLine();
        System.out.print("Ingrese Apellidos: ");
        apellidos[1] = scanner.nextLine();
        System.out.print("Ingrese Correo Electrónico: ");
        correosElectronicos[2] = scanner.nextLine();
        System.out.print("Ingrese Contraseña: ");
        contrasenias[3] = scanner.nextLine();
        System.out.print("Rol ( 1)Administrador 2) Registrador Votantes 3) Votante 4)Auditor)");
        roles[4] = scanner.nextInt();
        estado[5] = true;

        scanner.nextLine(); // Consume la línea en blanco después de nextInt()

        // Itera a través de los arrays y escribe los datos en el archivo
        try {
            FileWriter fw = new FileWriter(f, true);  // Appent  agregar 
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(nombres[0] + "|");
            bw.write(apellidos[1] + "|");
            bw.write(correosElectronicos[2] + "|");
            bw.write(contrasenias[3] + "|");
            bw.write(roles[4] + "|");
            bw.write(estado[5] + "|");
            bw.write("\n"); // Separador entre registros
            bw.close();
            System.out.println("Los datos de usuarios se han guardado ");
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    void modificarUsuario(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese correo de usuario ");
        String correo = scanner.nextLine();

      
        boolean a = false;
        File inputFile = new File("usuarios.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); 
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length >= 4 && parts[2].equals(correo)) {

                    System.out.println("Usuario encontrado. Por favor, modifique la información:");

                    System.out.print("Ingresed Nombres: ");
                    String nombres = scanner.nextLine();
                    System.out.print("Ingrese Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese Correo Electrónico: ");
                    String correosElectronicos = scanner.nextLine();                 
                    System.out.print("Rol ( 2) Registrador Votantes 3) Votante 4)Auditor)");
                    String roles = scanner.nextLine();
                    parts[0] = nombres;
                    parts[1] = apellidos;
                    parts[2] = correosElectronicos;
                    parts[4] = roles;

                    line = String.join("|", parts);
                    a = true;

                }

                writer.write(line + "\n");
            }

            if (!a) {
                System.out.println("Votante no encontrado.");
            } else {
                System.out.println("Información del votante modificada exitosamente.");
            }
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }

        inputFile.delete();
        tempFile.renameTo(inputFile);
    
    
    }

    
    void registroVotantes() {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[cantidadUsuarios];
        String[] apellidos = new String[cantidadUsuarios];
        String[] cui = new String[cantidadUsuarios];
        String[] sexo = new String[cantidadUsuarios];
        String[] fechaNacimiento = new String[cantidadUsuarios];
        String[] direccion = new String[cantidadUsuarios];
        String[] departamento = new String[cantidadUsuarios];
        String[] municipio = new String[cantidadUsuarios];
        String[] pais = new String[cantidadUsuarios];
        int[] roles = new int[cantidadUsuarios];
        boolean[] estado = new boolean[cantidadUsuarios];
        String[] contrasenia = new String[cantidadUsuarios];

        System.out.println("\nRegistro Votantes  ");
        System.out.println("Ingrese edad del votante: ");
        int edad = scanner.nextInt();
        scanner.nextLine();// Consumir el carácter de nueva línea pendiente

        if (edad >= 18) {

            File f = new File("usuarios_Votantes.txt"); // Archivo creado 

            System.out.print("Ingrese Nombre: ");
            nombres[0] = scanner.nextLine();
            System.out.print("Ingrese Apellidos: ");
            apellidos[1] = scanner.nextLine();
            System.out.print("Ingrese CUI: ");
            cui[2] = scanner.nextLine();
            System.out.print("Ingrese Sexo:(1)Mujer 2)Hombre)");
            sexo[3] = scanner.nextLine();
            System.out.print("Ingrese fecha Nacimiento: (DD/MM/AA) ");
            fechaNacimiento[4] = scanner.nextLine();
            System.out.print("Ingrese Direccion: ");
            direccion[5] = scanner.nextLine();
            System.out.print("Ingrese departamento: ");
            departamento[6] = scanner.nextLine();
            System.out.print("Ingrese Municipio: ");
            municipio[7] = scanner.nextLine();
            System.out.print("Ingrese  pais: ");
            pais[8] = scanner.nextLine();
            roles[9] = 3;
            estado[10] = true;
            generarCadenaAleatoria(16);
            System.out.println("contasenia de ususario: " + cadenaAleatoria);
            contrasenia[11] = cadenaAleatoria;

            System.out.print("\n\n ");

            // Itera a través de los arrays y escribe los datos en el archivo
            try {
                FileWriter fw = new FileWriter(f, true);  // Appent  agregar 
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(nombres[0] + "|");
                bw.write(apellidos[1] + "|");
                bw.write(cui[2] + "|");
                bw.write(sexo[3] + "|");
                bw.write(fechaNacimiento[4] + "|");
                bw.write(direccion[5] + "|");
                bw.write(departamento[6] + "|");
                bw.write(municipio[7] + "|");
                bw.write(pais[8] + "|");
                bw.write(roles[9] + "|");
                bw.write(estado[10] + "|");
                bw.write(contrasenia[11]);
                bw.write("\n"); // Separador entre registros
                bw.close();
                System.out.println("Los datos de usuarios se han guardado ");
                scanner.nextLine();
                
            } catch (IOException ex) {
                Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("El votante no cumple con la edad estipulada");
        }

    }

    void modificarVotante() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el CUI del votante que desea modificar: ");
        String cuiToModify = scanner.nextLine();

        // Find and modify the voter with the given CUI
        boolean a = false;
        File inputFile = new File("usuarios_Votantes.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length >= 4 && parts[2].equals(cuiToModify)) {

                    System.out.println("Votante encontrado. Por favor, modifique la información:");

                    System.out.print("Direccion: ");
                    String Di = scanner.nextLine();

                    System.out.print("Departamento: ");
                    String Depa = scanner.nextLine();

                    System.out.print("Municipio: ");
                    String Muni = scanner.nextLine();

                    System.out.print("Pais: ");
                    String pais = scanner.nextLine();

                    parts[5] = Di;
                    parts[6] = Depa;
                    parts[7] = Muni;
                    parts[8] = pais;

                    line = String.join("|", parts);
                    a = true;

                }

                writer.write(line + "\n");
            }

            if (!a) {
                System.out.println("Votante no encontrado.");
            } else {
                System.out.println("Información del votante modificada exitosamente.");
            }
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }

        inputFile.delete();
        tempFile.renameTo(inputFile);
    }


    void generarCadenaAleatoria(int longitud) {
        // Caracteres válidos para una cadena de letras y dígitos
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Inicializa un objeto Random
        Random random = new Random();

        // Crea un StringBuilder para construir la cadena aleatoria
        StringBuilder sb = new StringBuilder(longitud);

        // Genera la cadena aleatoria
        for (int i = 0; i < longitud; i++) {
            // Genera un índice aleatorio
            int indiceAleatorio = random.nextInt(caracteres.length());

            // Agrega el carácter aleatoria
            sb.append(caracteres.charAt(indiceAleatorio));
        }

        // Almacena la cadena aleatoria en la variable global o imprímela directamente
        cadenaAleatoria = sb.toString();
        // Si prefieres imprimir directamente en el método, utiliza: System.out.println("Cadena aleatoria: " + sb.toString());
    }

    void reiniContrVotante() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el CUI del votante a Modificar contrasenia: ");
        String cuiToModify = scanner.nextLine();

        // Find and modify the voter with the given CUI
        boolean a = false;
        File inputFile = new File("usuarios_Votantes.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length >= 4 && parts[2].equals(cuiToModify)) {
                    // Voter found, prompt for modifications
                    System.out.println("Votante encontrado. Por favor, modifique la información:");

                    System.out.print("Contasenia Nueva : ");
                    String contrasenia = scanner.nextLine();

                    // Update the voter information
                    parts[11] = contrasenia;

                    // Reconstruct the modified line
                    line = String.join("|", parts);
                    a = true;

                }

                writer.write(line + "\n");
            }

            if (!a) {
                System.out.println("Votante no encontrado.");
            } else {
                System.out.println("Contrasenia del votante modificada exitosamente.");
            }
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Replace the old file with the modified temporary file
        inputFile.delete();
        tempFile.renameTo(inputFile);

    }

    void registFalleVotante() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el CUI de la persona fallecida: ");
        String cuiToModify = scanner.nextLine();

        // Find and modify the voter with the given CUI
        boolean a = false;
        File inputFile = new File("usuarios_Votantes.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length >= 4 && parts[2].equals(cuiToModify)) {
                    // Voter found, prompt for modifications

                    // Update the voter information
                    parts[0] = "";
                    parts[1] = "";
                    parts[2] = "";
                    parts[3] = "";
                    parts[4] = "";
                    parts[5] = "";
                    parts[6] = "";
                    parts[7] = "";
                    parts[8] = "";
                    parts[9] = "";
                    parts[10] = "";
                    parts[11] = "";
                    line = String.join("", parts);

                    a = true;

                }

                writer.write(line + "\n");
            }

            if (!a) {
                System.out.println("Votante no encontrado.");
            } else {
                System.out.println(" Persona Borrada del sistema correctamente.");
            }
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Replace the old file with the modified temporary file
        inputFile.delete();
        tempFile.renameTo(inputFile);
    }

    void usuaContra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese Correo Electronico Modificar Contrasenia: ");
        String correo = scanner.nextLine();

        // Find and modify the voter with the given CUI
        boolean a = false;
        File inputFile = new File("usuarios.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length >= 5 && parts[2].equals(correo)) {
                    // Voter found, prompt for modifications
                    System.out.println("Votante encontrado. Por favor, modifique la información:");

                    System.out.print("Contasenia Nueva : ");
                    String contrasenia = scanner.nextLine();

                    // Update the voter information
                    parts[3] = contrasenia;

                    // Reconstruct the modified line
                    line = String.join("|", parts);
                    a = true;

                }

                writer.write(line + "\n");
            }

            if (!a) {
                System.out.println("Votante no encontrado.");
            } else {
                System.out.println("Contrasenia del votante modificada exitosamente.");
            }
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Replace the old file with the modified temporary file
        inputFile.delete();
        tempFile.renameTo(inputFile);

    }

    public boolean inicioVotantes(String correo, String contrasenia, boolean b) {
        String correoo = correo;
        String contra = contrasenia;

        int rol = 2;
        File inputFile = new File("usuarios.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            boolean found = false; // Utilizamos una variable 'found' para rastrear si se encontró una coincidencia

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length >= 6 && parts[2].equals(correoo) && parts[3].equals(contra)&& parts[4].equals(Integer.toString(rol)) ) {
                    // Si se encuentra una coincidencia, establece 'b' en true
                    
                    b = true;
                    found = true; // Indicamos que se encontró una coincidencia
                } else {
                    // Si no es una coincidencia, escribimos la línea en el archivo temporal
                    writer.write(line + "\n");
                }
            }

            if (!found) {
                System.out.println("Correo o contraseña no coinciden.");
            }
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Después de procesar todos los votantes, debes eliminar el archivo original
        // y renombrar el archivo temporal al original
      
        return b;
    }


boolean contraVotantes (String nit3, String contrasenia3, boolean t) {
        String nit = nit3;
        String contra = contrasenia3;

        int rol = 3;
        File inputFile = new File("usuarios_Votantes.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            boolean found = false; // Utilizamos una variable 'found' para rastrear si se encontró una coincidencia

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length >= 6 && parts[2].equals(nit) && parts[11].equals(contra)&& parts[9].equals(Integer.toString(rol)) ) {
                    // Si se encuentra una coincidencia, establece 'b' en true
                    
                    t = true;
                    found = true; // Indicamos que se encontró una coincidencia
                } else {
                    // Si no es una coincidencia, escribimos la línea en el archivo temporal
                    writer.write(line + "\n");
                }
            }

            if (!found) {
                System.out.println("Correo o contraseña no coinciden.");
                t= false;
            }
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Después de procesar todos los votantes, debes eliminar el archivo original
        // y renombrar el archivo temporal al original
return t;
}


    int contraInicio (String correo3, String contra3, int n) {
        String correo = correo3;
        String contra = contra3;

        int nn = n;
        File inputFile = new File("usuarios.txt");
        File tempFile = new File("temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            boolean found = false; // Utilizamos una variable 'found' para rastrear si se encontró una coincidencia

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length >= 6 && parts[2].equals(correo) && parts[3].equals(contra) ) {
                    // Si se encuentra una coincidencia, establece 'b' en true
                   if (parts.length >= 6 && Integer.parseInt(parts[4]) == 1) {
                     nn = 1;
                    } 
                   if (parts.length >= 6 && Integer.parseInt(parts[4]) == 2) {
                     nn = 2;
                    }
                     if (parts.length >= 6 && Integer.parseInt(parts[4]) == 3) {
                     nn = 3;
                    }
                     if (parts.length >= 6 && Integer.parseInt(parts[4]) == 4) {
                     nn = 4;
                    }
                    found = true; // Indicamos que se encontró una coincidencia
                } else {
                    // Si no es una coincidencia, escribimos la línea en el archivo temporal
                    writer.write(line + "\n");
                }
            }

            if (!found) {
                System.out.println("Correo o contraseña no coinciden.");
                 nn = 0;
            }
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFinal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Después de procesar todos los votantes, debes eliminar el archivo original
        // y renombrar el archivo temporal al original
return nn;
}




}