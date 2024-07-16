package com.teamovercomers.Church.Management.Application.entity;

import jakarta.persistence.*;
import lombok.Data;

    @Entity
    @Data
    @Table(name = "PaymentMethod")

    public class PaymentMethod {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        @Column(name = "type")
        private String type;
        @Column(name = "name")
        private String name;

        public PaymentMethod(){

        }


        public Long getId(){
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getType(){
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName(){
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public PaymentMethod(Long id, String type,String name){
            this.id = id;
            this.type =type;
            this.name =name;
        }
    }


