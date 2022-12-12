public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FirstClass myobjet = new FirstClass();
        System.out.println(myobjet.x);
        FirstClass myobjet2 = new FirstClass();
        System.out.println((myobjet2.x) * 2);
        SecondClass mysobjet = new SecondClass();
        System.out.println(mysobjet.x);

        Etudiants AYENA = new Etudiants();
        System.out.println("je m'appelle : " + AYENA.nom + "  " + AYENA.prenom + ", de matricule " + AYENA.matricule + ", de sexe " + AYENA.sexe + ", d'age " + AYENA.age + " et repond au " + AYENA.tel);
        myMethod();
        myStaticMethod();
        Enseignants KOWO = new Enseignants();
        System.out.println("je m'appelle : " + KOWO.nom + "  " + KOWO.prenom + ", de matricule " + KOWO.identifiant + ", de sexe " + KOWO.sexe + ", d'age " + KOWO.age + " et repond au " + KOWO.tel);
    }

    static void myMethod() {
        System.out.println("Hello World!");

    }

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

}