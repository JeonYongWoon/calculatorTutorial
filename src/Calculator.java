import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> results = new ArrayList<>();

    public int calculate(int fstNum, int secNum, char arithmetic) {
        int result = 0;

        switch (arithmetic) {
            case '+':
                result = fstNum + secNum;
                break;
            case '-':
                result = fstNum - secNum;
                break;
            case '*':
                result = fstNum * secNum;
                break;
            case '/':
                if (secNum == 0) {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                    return 0;
                }
                result = fstNum / secNum;
                break;
            default:
                System.out.println("잘못된 연산기호입니다.");
                return 0;


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