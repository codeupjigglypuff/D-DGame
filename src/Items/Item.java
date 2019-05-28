package Items;

public class Item {
    private String Name;
    private String Item_Type;
    private int value;
    private String Description;

    public Item(){}


    public Item(String name,String item_Type,int Value,String Description){
        this.Name = name;
        this.Item_Type = item_Type;
        this.value = Value;
        this.Description = Description;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setItem_Type(String item_Type) {
        Item_Type = item_Type;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public String getItem_Type() {
        return Item_Type;
    }

    public int getValue() {
        return value;
    }

    public String getDescription(){
        return "Name :"+Name+"\nType :"+Item_Type+"\nValue :"+value+"\nDescription :"+Description+"\n";
    }

}
