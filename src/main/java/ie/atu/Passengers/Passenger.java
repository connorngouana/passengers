package ie.atu.Passengers;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table

public class Passenger
{
    public String Title;
    public String Name;
    public String Id;
    public String Phone;
    public int Age;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long count;



    public Passenger(String title, String name, String id, String phone, int age )
    {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }
    public String getTitle()
    {
        return Title;
    }

    public void setTitle(String title)
    {
        if(title == "mr" || title == "ms" || title == "mrs")
        {
            Title = title;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid title, title must be mr, ms and mrs");
        }
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        if(name.length() >= 3)
        {
            this.Name = name;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid name, name must have minimum 3 characters");
        }
    }

    public String getId()
    {
        return Id;
    }

    public void setId(String id)
    {
        if (id.length() >= 10)
        {
            this.Id = id;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid Id, Id must have minimum 10 digits");
        }
    }

    public String getPhone()
    {
        return Phone;
    }

    public void setPhone(String phone)
    {
        if(phone.length() >= 7)
        {
            this.Phone = phone;
            int length = Phone.length();
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid number, number must have 7 digits");
        }
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int age)
    {
        if(age > 16)
        {
            this.Age = age;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid age, you must be 16 plus");
        }

    }




}
