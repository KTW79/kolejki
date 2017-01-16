package zadanie2;

/**
 * Created by Kasia on 16.01.2017.
 */
public class Kwiatek {
    private int leafsnumb;
    private int flakenumb;
    private String name;


    public Kwiatek(int leafsnumb, int flakenumb, String name) {
        this.leafsnumb = leafsnumb;
        this.flakenumb = flakenumb;
        this.name = name;
    }


    public int getLeafsnumb() {
        return leafsnumb;
    }

    public void setLeafsnumb(int leafsnumb) {
        this.leafsnumb = leafsnumb;
    }

    public int getFlakenumb() {
        return flakenumb;
    }

    public void setFlakenumb(int flakenumb) {
        this.flakenumb = flakenumb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kwiatek kwiatek = (Kwiatek) o;

        if (leafsnumb != kwiatek.leafsnumb) return false;
        if (flakenumb != kwiatek.flakenumb) return false;
        return name != null ? name.equals(kwiatek.name) : kwiatek.name == null;
    }

    @Override
    public int hashCode() {
        int result = leafsnumb;
        result = 31 * result + flakenumb;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Kwiatek o nazwie: " + getName() + "\nilość liści: " + getLeafsnumb() + "\nilość płatków: " + getFlakenumb()
                + "\n";
    }

    /*
    	W	osobnej	klasie	utwórz
	3	obiekty	tego	typu	i:	-	wyświetl	informacje	o	każdym	z	nich	na	ekranie	-	porównaj
	obiekty	i	wyświetl	informację,	czy	obiekt1	jest	równy	obiektowi2	lub	obiekt1	jest	równy	obiektowi3
		lub	obiekt2	jest	równy	obiektowi3
     */
}
