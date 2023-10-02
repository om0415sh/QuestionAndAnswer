package questionandanswerPackage;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Map<Object, Object> map = new HashMap<>();
		
		int action = 0;
		
		System.out.println("これは一問一答アプリです");
		System.out.println("次の中から実行したい機能の番号を選択してください");
		System.out.println("1.追加\n2.削除\n3.一覧表示\n4.出題\n5.終了");
		System.out.println("＞＞＞");
		for(int i = 0; i < 1; i++) {
			try {
				Scanner scanner = new Scanner(System.in);
				int act = scanner.nextInt();
				action = act;
				if (action ==1||action ==2||action ==3||action ==4||action ==5) {
					;
				}else {
					System.out.println("1〜5の数字で入力してください");
					i--;
					continue;
				}
			}catch(InputMismatchException e) {
				System.out.println("1〜5の数字で入力してください");
				i--;
			}
		}
		
		switch(action) {
		case 1:
			System.out.println("リストに追加します");
			break;
		case 2:
			System.out.println("リストから削除します");
			break;
		case 3:
			System.out.println("リスト一覧を表示します");
			break;
		case 4:
			System.out.println("リストから問題を出題します");
			break;
		case 5:
			System.out.println("アプリを終了します");
			break;
		}
	}

}


