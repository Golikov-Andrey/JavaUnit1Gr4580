package CatLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Cat {
   
    public int weight;
    public String name;
    public int color;
    public Date age;
    public boolean isMan;
    public long id;

    public Cat(int weight, String name, int color, Date age, boolean isMan, long id) {
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMan = isMan;
        this.id = id;
    }

    public boolean medSup()
    {
        return true;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        // TODO Auto-generated method stub
        return "Кличка: "+ name+" ID: "+id+" Вес: "+weight+ " Дата рождения: "+formatter.format(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && color == cat.color && isMan == cat.isMan ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name, color, age, isMan, id);
    }

}
