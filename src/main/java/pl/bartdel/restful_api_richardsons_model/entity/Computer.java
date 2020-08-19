package pl.bartdel.restful_api_richardsons_model.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated
    @NotNull
    private ComputerProducer computerProducer;

    @NotNull
    private boolean windowsIncluded;

    @NotNull
    private BigDecimal price;

    public Computer() {
    }

    public Computer(ComputerProducer computerProducer, boolean windowsIncluded, BigDecimal price) {
        this.computerProducer = computerProducer;
        this.windowsIncluded = windowsIncluded;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ComputerProducer getComputerProducer() {
        return computerProducer;
    }

    public void setComputerProducer(ComputerProducer computerProducer) {
        this.computerProducer = computerProducer;
    }

    public boolean isWindowsIncluded() {
        return windowsIncluded;
    }

    public void setWindowsIncluded(boolean windowsIncluded) {
        this.windowsIncluded = windowsIncluded;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
