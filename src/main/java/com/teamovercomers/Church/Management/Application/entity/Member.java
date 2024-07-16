package com.teamovercomers.Church.Management.Application.entity;


import jakarta.persistence.*;
import lombok.Data;

    @Entity
    @Data

    @Table(name = "Member")

    public class Member {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;
        @Column(name = "name")
        private String name;
        @Column(name = "location")
        private String location;
        @Column(name = "email")
        private String email;

        @Column(name = "phoneNumber")
        private String phoneNumber;

        public Member(){

        }


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name =name;
        }
        public String getLocation(){
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
        public String getEmail(){
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public String getPhoneNumber(){
            return phoneNumber;
        }

        public void setPhoneNumber(String phone) {
            this.phoneNumber = phoneNumber;
        }
        public Member( Integer id ,String name, String location,String email,String phoneNumber){
            this.id = id;
            this.name = name;
            this.location = location;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }
    }



