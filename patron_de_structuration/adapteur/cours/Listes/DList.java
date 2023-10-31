package patrons_de_structuration.patron_Adapter.exemple2;

public class DList {
    public DNode list;
    public void insert (DNode pos,Object o){
        DNode po=new DNode();
        po.elem=o;
        po.suiv=pos.suiv;
        pos.suiv=po;
    }

    public void remove(DNode pos){
        pos.prec=pos.suiv;
    }

    public void insertHead(Object o){
        
    }

    public Object removeHead(){return null;}
    public Object removeTail(){return null;}


    public Object getHead(){return null;}
    public Object getTail(){return null;}

    
}
