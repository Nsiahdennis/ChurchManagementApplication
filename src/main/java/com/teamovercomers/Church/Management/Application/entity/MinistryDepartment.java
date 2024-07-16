package com.teamovercomers.Church.Management.Application.entity;

import jakarta.persistence.*;
import lombok.Data;

    @Entity
    @Data
    @Table(name = "MinistryDepartment")
    public class MinistryDepartment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        @Column(name = "name")
        private String name;
        @Column(name = "type")
        private String type;

        public MinistryDepartment(){

        }

        public Long getId(){
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getType(){
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
        public MinistryDepartment(Long id, String name,String type){
            this.id =id;
            this.name = name;
            this.type = type;


        }
    }


