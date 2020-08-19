package pl.bartdel.restful_api_richardsons_model.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Guitar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated
    @NotNull
    private GuitarProducer guitarProducer;

    @Enumerated
    @NotNull
    private GuitarType guitarType;

    @NotNull
    private BigDecimal price;

    public Guitar() {
    }

    public Guitar(GuitarProducer guitarProducer, GuitarType guitarType, BigDecimal price) {
        this.guitarProducer = guitarProducer;
        this.guitarType = guitarType;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GuitarProducer getGuitarProducer() {
        return guitarProducer;
    }

    public void setGuitarProducer(GuitarProducer guitarProducer) {
        this.guitarProducer = guitarProducer;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
