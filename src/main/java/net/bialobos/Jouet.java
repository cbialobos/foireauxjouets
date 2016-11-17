package net.bialobos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Jouet {
    @Id
    @GeneratedValue
    private Long id;

    private String label;

    private Double price;

    protected Jouet() {
    }

    public Jouet(String label, Double price) {
        this.label = label;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public void setlabel(String label) {
        this.label = label;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Jouet[id=%d, Label='%s', Price='%d']", id,
                label, price);
    }
}