package lista;

public class Exercicio11 {
  public static void executar() {
    Integer nums[] = new Integer[3];

    Prompt.imprimir("Informe três valores");

    for (int i = 0; i < nums.length; i++) {
      Prompt.imprimir("Informe o valor " + (i + 1));
      nums[i] = Prompt.lerInteiro();
    }

    if (nums.equals(nums)) {
      for (int i = 0; i < nums.length - 1; i++) {
        for (int j = 0; j < nums.length - i - 1; j++) {
          if (nums[j] > nums[j + 1]) {
            int temp = nums[j];
            nums[j] = nums[j + 1];
            nums[j + 1] = temp;
          }
        }
      }

      Prompt.separador();
      Prompt.imprimir("A Ordem crescente dos números são:");
      for (int num : nums) {
        System.out.print(num + " ");
      }
    }
  }
}
