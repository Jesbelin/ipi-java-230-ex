package com.ipiecoles.java.java230;

import com.ipiecoles.java.java230.model.Employe;
import com.ipiecoles.java.java230.repository.EmployeRepository;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    EmployeRepository employeRepository;


    //Point d'entrée réel de notre appli, c'est ici qu'on entrera ce qu'on veut tester
    @Override
    public void run(String... strings) {
        LocalDate date = LocalDate.parse("2018-09-11");
        Employe e = employeRepository.findOne(5L);
        /*
        System.out.println(employeRepository.count());

        System.out.println("Est(ce que l'employe d'id 5 existe? : " + employeRepository.exists(5L));

        System.out.println("Est(ce que l'employe d'id 555555555 existe? : " + employeRepository.exists(555555555L));
        */

        e = new Employe("Jolivald", "Steven", "XXXXXX", date, 2000d);

        /*
        e = employeRepository.save(e);

        Long id = e.getId();
        System.out.println("Id employe : " + id);

        e = employeRepository.findOne(id);
        e.setSalaire(5000.0);
        e = employeRepository.save(e);
        */

        //employeRepository.delete(2504L);


    }
}

        /*
        System.out.println("Hello");

        String url = "jdbc:mysql://localhost:3306/entreprise";
        String user = "root"; String pwd = "";
        java.sql.Connection connexion = null;

        try{
            connexion = java.sql.DriverManager.getConnection(url, user, pwd);
        } catch ( java.sql.SQLException e ) {
            //Problème de connexion à la base !
            System.out.println("Marche pas!");
        }
        //L'object connexion va nous permettre d'effectuer des requêtes...
        try {
            //La variable de type Statement permettra de gérer des requêtes SQL
            Statement statement = connexion.createStatement();

            //La variable de type ResultSet contiendra les résultats de la requêtes
            String query = "SELECT * FROM employe";
            ResultSet resultSet = statement.executeQuery(query);

            //On parcours un à un les résultats grâche à next() qui renvoie un booléen
            //précisant s'il y a une ligne suivante dans nos résultats et récupère ce
            //résultat le cas échéant (au début, son curseur est situé avant le premier élément).
            while (resultSet.next()) {
                System.out.println("Identifiant : " + resultSet.getInt("id"));
                System.out.println("Nom : " + resultSet.getString("nom"));
                System.out.println("Prénom : " + resultSet.getString("prenom"));
                System.out.println("Matricule : " + resultSet.getString("matricule"));
                System.out.println("Date d'embauche : " + resultSet.getDate("dateEmbauche"));
                System.out.println("Salaire : " + resultSet.getDouble("salaire"));//SQLException
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Salaire ?");
            Double salaire = scanner.nextDouble();

            query = "INSERT INTO employe(nom, prenom, matricule, dateEmbauche, salaire) VALUES ('CEROT', 'Bertrand', 'G6666', '2018-09-11', " +  salaire + ")";
            int status = statement.executeUpdate(query);
            System.out.println(status + "ligne(s) insérées");


        } catch (SQLException e){
            System.out.println("Problème lors de l'exécution de la requête");
        }

        //Lorsqu'on a fini de l'utiliser :
        if(connexion != null) {
            try {
                connexion.close();
            }
            catch ( java.sql.SQLException e ) {
                //Problème de déconnexion, ce n'est pas très grave...
                System.out.println("Problème lors de la connexion !!");
            }
        }
    }

    public static void print(Object t) {
        System.out.println(t);
    }

}*/