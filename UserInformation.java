package com.example.databasetest;

class UserInformation {


        public String id;
        public String name;
        public String username;
        public String dob;
      public String email;
      public String password;
      public String voterid;
      public String phone;




    public UserInformation()
        {

        }

        public UserInformation(String id, String name, String Username  , String Dob, String Email, String Password, String Voterid, String Phone)
        {
            this.id = id;
            this.name=name;
            this.username=Username;
            this.dob=Dob;
            this.email=Email;
            this.password=Password;
            this.voterid=Voterid;
            this.phone=Phone;
        }


}

