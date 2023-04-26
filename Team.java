import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Personage> implements Iterable<T>{
    List<T> personages = new ArrayList<>();
    @Override
    public Iterator<T> iterator() {
        return personages.iterator();
    }

    public Team<T> addPers (T personage){
        this.personages.add(personage);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (T personage:this) {
            res.append(personage)
                    .append("\n");
        }
        // res.append(String.format("Миниальная защита: %d\n",minProtect()));
        return res.toString();
    }


    // public int minProtect (){
    //     int min = 6;
    //     for (T pers:this) {
    //             if(pers.protectionShield.protectionShield()<min){
    //                 min= pers.protectionShield.protectionShield();
    //             }
    //         }
    //     return min;
    }

