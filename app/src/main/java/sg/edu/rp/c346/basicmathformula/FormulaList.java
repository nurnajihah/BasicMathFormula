package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 17010475 on 17/7/2018.
 */

public class FormulaList {

    private String formulaname;
    private String formula;
    private String type;

    public FormulaList(String formulaname, String formula, String type) {
        this.formulaname = formulaname;
        this.formula = formula;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormulaname() {
        return formulaname;
    }

    public void setFormulaname(String formulaname) {
        this.formulaname = formulaname;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "FormulaList{" +
                "formulaname='" + formulaname + '\'' +
                ", formula='" + formula + '\'' + "type=" + type +
                '}';
    }
}
