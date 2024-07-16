package com.teamovercomers.Church.Management.Application.entity;

import jakarta.persistence.*;
import lombok.Data;

    @Entity
    @Data
    @Table( name = "Facility")
    public class Facility {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "id")
        private Long id;
        @Column(name = "type")
        private String type;

        @Column(name = "name")
        private String name;

        public Facility(){

        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name =name;
        }
        public String getType(){
            return type;
        }
        public void setType(String type){
            this.type =type;
        }
        public Long getId(){
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }


        public Facility(Long id ,String type,String name){
            this.id =id;
            this.name = name;
            this.type = type;
        }
    }



