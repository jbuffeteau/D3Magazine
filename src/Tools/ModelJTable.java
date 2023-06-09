package Tools;

import Entities.Article;
import Entities.Magazine;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] columns;
    private Object[][] rows;

    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    public void loadDatasMagazines(ArrayList<Magazine> lesMagazines)
    {
        columns = new String[]{"Numéro","Nom"};
        rows = new Object[lesMagazines.size()][2];
        int i = 0;
        for (Magazine mag : lesMagazines)
        {
            rows[i][0] = mag.getNumMagazine();
            rows[i][1] = mag.getNomMagazine();
            i++;
        }
        fireTableChanged(null);
    }
    public void loadDatasArticle(ArrayList<Article> lesArticles)
    {
        columns = new String[]{"Nom","Nombre de pages","Nom du pigiste"};
        rows = new Object[lesArticles.size()][3];
        int i = 0;
        for (Article art : lesArticles)
        {
            rows[i][0] = art.getTitreArticle();
            rows[i][1] = art.getNbPages();
            rows[i][2] = art.getLePigiste().getNomPigiste();
            i++;
        }
        fireTableChanged(null);
    }
}
