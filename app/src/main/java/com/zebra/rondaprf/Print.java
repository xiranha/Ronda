package com.zebra.rondaprf;

/**
 * Created by Fabio on 10/10/16.
 */

public class Print {

        private int id;
        private String name;
        private String address;

        public Print()
        {
        }

        public Print(int id,String name,String address)
        {
            this.id=id;
            this.name=name;
            this.address=address;
        }

        public Print(String name,String address)
        {
            this.name=name;
            this.address=address;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getId() {

            return id;
        }

        public String getAddress() {
            return address;
        }

        public String getName() {
            return name;
        }


}
