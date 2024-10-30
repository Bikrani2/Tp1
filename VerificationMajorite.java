class VerificationMajorite {
  
  public static void main(String[] args) {
    
     int age = Integer.parseInt(args[0]); //pour convertir args[0] qui est une chaine de caractère et qui contient un entier en type integer on utilise Integer.parseInt()
     System.out.println("Age passe en argument :" + age);
     if (age >= 18) {
        System.out.println("Vous etes majeur.");
     } else {
        System.out.println("Vous etes mineur.");
     }

  }
  
}

