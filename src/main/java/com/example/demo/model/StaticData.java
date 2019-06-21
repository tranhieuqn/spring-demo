package com.example.demo.model;

import com.example.demo.model.enums.StaticDataType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class StaticData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private StaticDataType staticDataType;

    @NotBlank
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk__static_data_self_ref"))
    @JsonIgnore
    private StaticData parent;

    @Transient
    private List<StaticData> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StaticDataType getStaticDataType() {
        return staticDataType;
    }

    public void setStaticDataType(StaticDataType staticDataType) {
        this.staticDataType = staticDataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StaticData getParent() {
        return parent;
    }

    public void setParent(StaticData parent) {
        this.parent = parent;
    }

    public List<StaticData> getChildren() {
        return children;
    }

    public void setChildren(List<StaticData> children) {
        this.children = children;
    }
}
