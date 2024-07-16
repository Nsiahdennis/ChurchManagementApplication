package com.teamovercomers.Church.Management.Application.entity;

import jakarta.persistence.*;
import lombok.Data;



    @Entity
    @Data
    @Table(name = "church")
    public class Church {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

        @Column(name = "address")
        private String address;

        public Church() {
        }

        @Column(name = "church_name")
        private String church_name;

        @Column(name = "location")
        private String location;

        @Column(name = "email")
        private String email;


        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getChurch_name() {
            return church_name;
        }

        public void setChurch_name(String church_name) {
            this.church_name = church_name;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


        public Church(Integer id, String name, String location, String email, String address) {
            this.id = id;
            this.church_name = name;
            this.location = location;
            this.email = email;
            this.address = address;
        }



    }


