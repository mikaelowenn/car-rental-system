package carrentalsystem_final;
import Annotations.IdField;
import Annotations.IntegerField;
import Annotations.BooleanField;
import Annotations.FloatField;
import java.time.LocalTime;

public abstract class BaseClass {
    @IdField
    private int id;


    public int getId() {
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

}

