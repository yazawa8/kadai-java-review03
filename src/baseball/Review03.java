package baseball;

public class Review03 {
    public static void main(String[] args) {
        // 各チームのインスタンスを生成
        BaseBallTeam tokyoYakultSwallows = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam yokohamaDeNA = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam hanshinTigers = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam yomiuriGiants = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam hiroshimaCarp = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam chunichiDragons = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        // 各チームの報告メソッドを呼び出し
        tokyoYakultSwallows.report();
        yokohamaDeNA.report();
        hanshinTigers.report();
        yomiuriGiants.report();
        hiroshimaCarp.report();
        chunichiDragons.report();
    }
}
