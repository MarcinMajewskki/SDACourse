package org.example.strings.oop_excercises_SDA.boxcopying;

import java.util.Objects;

public class Box {
    private String name;
    private int size;

    public Box(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Box getCopyNewInstance(){
        return new Box(this.name,this.size);

    }

    @Override
    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return size == box.size && Objects.equals(name, box.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}

