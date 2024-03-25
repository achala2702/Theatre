class Person {
    private String userName;
    private String userSurname;
    private String userEmail;

    public Person(){

    }
    public Person(String name, String surName, String eMail){
        this.userName = name;
        this.userSurname = surName;
        this.userEmail = eMail;
    }
    public String getName() {

        return this.userName;
    }


    public void setName(String name) {

        this.userName = name;
    }

    public String getSur_name() {

        return this.userSurname;
    }

    public void setSur_name(String sur_name) {

        this.userSurname = sur_name;
    }

    public String geteMail() {

        return this.userEmail;
    }

    public void seteMail(String eMail) {

        this.userEmail = eMail;
    }


    /*public Person(){
        String person_name;
        String sur_name;
        String e_mail;
    }
   void setData(String name, String surname, String eMail){
        person_name = name;
        sur_name = surname;
        e_mail = eMail;

    }*/
}
