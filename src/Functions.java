public class Functions {

    static void main() {

        /*
            Las funciones son fracciones de códigos que usamos
            para reutilizarlas cuando sea necesario cuentan con
            modificador de acceso, tipo si retorna o no valores,
            y si cuenta o no con parámetros, en algunos leng de
            programación no permitirá la sobre carga de funciones
        */

        //funciones sin retorno ni parámetros
        sendEmail();

        //funciones sin retorno con parámetros
        sendEmailToUser("david@dev.co");

        //funciones con sobre carga
        sendEmailToUsers("david@dev.co","david");

        String[] emails = {"david@dev.co","ximena@dev.co","calixto@dev.co"};
        sendEmailToUsers(emails);

        System.out.println(sendEmailToUsers(emails,true));
        emails = new String[0];
        System.out.println(sendEmailToUsers(emails,false));


    }

    static void sendEmail(){
        System.out.println("Enviando email...");
    }

    static void sendEmailToUser(String email){
        System.out.println("Enviando email To: "+email);
    }


    static void sendEmailToUsers(String email, String user){
        System.out.println("Enviando email To: "+email+" User: "+user);
    }

    static void sendEmailToUsers(String[] emails){

        for (String email : emails) {
            System.out.println("Enviando email To: "+email);
        }
    }

    static boolean sendEmailToUsers(String[] emails, boolean alert){

        if(emails.length == 0){
            System.out.println("Sin Enviar!");
            return false;
        }
        for (String email : emails) {
            System.out.println("Enviando email To: "+email);
        }

        if(alert){
            System.out.println("Enviados Correctamente!");
        }
        return true;
    }
}
