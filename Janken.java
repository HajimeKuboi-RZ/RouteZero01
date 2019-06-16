package routezero.java.traning1;

import java.util.Scanner;

public class Janken {
	public static void main(String[] args) {
		System.out.print("1：グー 2:チョキ 3:パー\n");
		/* じゃんけんの手を数値で設定
		 * グー：1、チョキ:2、パー:3
		 */
		Scanner sc = new Scanner(System.in);
		// 入力者を男と女の２名に設定
		int man = sc.nextInt();
		int lady = sc.nextInt();
		sc.close();

		System.out.print("じゃんけんぽん！\n");
		// 入力後の宣言
		System.out.print("\n");
		System.out.print("男\n");

		if(man == 1) System.out.print("グー\n");
		else if(man == 2) System.out.print("チョキ\n");
		else if(man == 3) System.out.print("パー\n");

		System.out.print("\n");
		System.out.print("女\n");

		if(lady == 1) System.out.print("グー\n");
		else if(lady == 2) System.out.print("チョキ\n");
		else if(lady == 3) System.out.print("パー\n");
		System.out.print("\n");

		if(man == lady)System.out.print("あいこです。");
		else if(man == 1){
			if(lady == 2) System.out.print("男の勝ちです。");
			else if(lady == 3) System.out.print("女の勝ちです。");
		}
		else if(man == 2){
			if(lady == 3) System.out.print("男の勝ちです。");
			else if(lady == 1) System.out.print("女の勝ちです。");
		}
		else if(man == 3){
			if(lady == 1) System.out.print("男の勝ちです。");
			else if(lady == 2) System.out.print("女の勝ちです。");
		}
	}
}
