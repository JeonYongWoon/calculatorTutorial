import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> results = new ArrayList<>();

    public int calculate(int fstNum, int secNum, OperatorType op) {
        int result = 0;

        switch (op) {
            case ADD:
                result = fstNum + secNum;
                break;
            case SUB:
                result = fstNum - secNum;
                break;
            case MUL:
                result = fstNum * secNum;
                break;
            case DIV:
                if (secNum == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                result = fstNum / secNum;
                break;
        }

        results.add(result);

        return result;
    }
    // Getter
    public ArrayList<Integer> getResults() {
        return results;
    }

    // Setter
    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}