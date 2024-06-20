package org.example.entity;

import java.util.Date;

public class Park {

    public class Attraction {
        private String attractionName;
        private String dataJob;
        private int price;

        public Attraction(String attractionName, String dataJob, int price) {
            this.attractionName = attractionName;
            this.dataJob = dataJob;
            this.price = price;
        }

        @Override
        public String toString() {
            return String.format("""
                    Парк аттракционов:
                    Название аттракциона - %s
                    Время работы - %s
                    Стоимость - %s рублей
                    """, attractionName, dataJob, price);
        }
    }
}
