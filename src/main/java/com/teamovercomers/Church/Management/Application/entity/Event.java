package com.teamovercomers.Church.Management.Application.entity;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



    @Entity
    @Data
    @Table(name = "Event")

    public class Event {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "id")
        private Long id;

        @Column(name = "type")
        private String type;

        @Column(name = "name")
        private String name;

        public  Event(){

        }


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public Event(Long id, String name, String type) {
            this.id = id;
            this.name = name;
            this.type = type;
        }



    }


