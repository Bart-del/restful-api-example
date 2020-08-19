package pl.bartdel.restful_api_richardsons_model.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated
    @NotNull
    private CarProducer carProducer;

    @NotNull
    private Date productionYear;

    @NotNull
    private BigDecimal price;

    public Car() {
    }

    public Car(CarProducer carProducer, Date productionYear, BigDecimal price) {
        this.carProducer = carProducer;
        this.productionYear = productionYear;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarProducer getCarProducer() {
        return carProducer;
    }

    public void setCarProducer(CarProducer carProducer) {
        this.carProducer = carProducer;
    }

    public Date getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Date productionYear) {
        this.productionYear = productionYear;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
