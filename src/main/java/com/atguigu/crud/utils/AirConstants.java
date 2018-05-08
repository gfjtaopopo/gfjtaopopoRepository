/*
 * 業務固有ページ実装クラス.
 * @version 1.00
 * @copyright All Rights Reserved. Copyright(C) 2016 ALPEN CORPORATION.
 */

package com.atguigu.crud.utils;

import java.math.BigDecimal;

/**
 * 定数ファイルです。
 *
 * @since 1.0.0
 */
public class AirConstants {

	/**
	 * enum用インターフェース
	 *
	 */
	public interface EnumBehaviour {

		//コードを取得する
        String getCode();
        //名称を取得する
        String getName();
    }

	//*************************SSM_CRUD　START*******************
	
	/**
	 * 员工名正则表达式(2-6位中文 或者 3-16位英文和数字的组合)
	 */
	public static final String EMP_NAME_REGEX = "(^[a-zA-Z0-9_-]{3,16}$)|(^[\\u2E80-\\u9FFF]{2,6}$)";
	
	/**
	 * 员工名不合法错误信息
	 */
	public static final String EMP_NAME_ERR_MSG = "员工名:2-6位中文 或者 3-16位英文和数字的组合";
	
	/**
	 * 员工名数据库重复校验错误信息
	 */
	public static final String EMP_NAME_DB_ERR_MSG = "员工名不可用";
	
	/**
	 * Email正则表达式
	 */
	public static final String EMAIL_REGEX = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
	
	/**
	 * Email错误信息
	 */
	public static final String EMAIL_ERR_MSG = "邮箱格式不正确";
	
	/**
	 * 连续显示页号数
	 */
	public static final int PAGE_RANGE_SIZE = 5;
	
	/**
	 * 通用的返回类:状态码  100-成功
	 */
	public static final int SUCCESS_MSG_CODE = 100;
	
	/**
	 * 通用的返回类:状态码  200-失败
	 */
	public static final int FAIL_MSG_CODE = 200;
	
	/**
	 * 日付フォーマット（yyyy/MM/dd）.
	 */
	public static final String FORMAT_DATE = "yyyy/MM/dd";

	/**
	 * 日付フォーマット（yyyyMMdd）.
	 */
	public static final String FORMAT_DATE_NOSURA = "yyyyMMdd";

	/**
	 * 日付フォーマット（yyyyMM）.
	 */
	public static final String FORMAT_DATE_YM = "yyyyMM";

	/**
	 * 日付フォーマット（yyyy/MM）.
	 */
	public static final String FORMAT_DATE_YM_SURA = "yyyy/MM";

	/**
	 * 日付フォーマット（yyyy-MM-dd）.
	 */
	public static final String FORMAT_DATE_HAIFUN = "yyyy-MM-dd";

	/**
	 * 時間フォーマット（yyyy/MM/dd HH:mm:ss）.
	 */
	public static final String FORMAT_DATE_TIME= "yyyy/MM/dd HH:mm:ss";

	/**
	 * 時間フォーマット（yyyyMMddHHmmss）.
	 */
	public static final String FORMAT_DATE_TIME_CSV= "yyyyMMddHHmmss";

	/**
	 * 時間フォーマット（HHmmss）.
	 */
	public static final String FORMAT_SYS_TIME= "HHmmss";

	/**
	 * 年週フォーマット（yyyy/WW週）.
	 */
	public static final String FORMAT_WEEK_YW= "yyyy/WW週";

	/**
	 * 日付フォーマット（yyyy年MM月dd日）.
	 */
	public static final String FORMAT_DATE_YMD = "yyyy年MM月dd日";
	
	/**
	 * INIファイルの文字コード
	 */
	public static final String INI_ENCODE = "UTF-8";

	/**
	 * コメント標識
	 */
	public static final String SYMBOL_COMMENT = ";";

	/**
	 * 終了標識
	 */
	public static final String SYMBOL_END = "END";
	
	//*************************SSM_CRUD　END*********************
	
	//*************************画面用定数定義領域　START*******************

	/**
	 * 偶数行で背景色
	 */
	public static final String SORT_MEISAIROW1CSS = "meisaiRow1Css";

	/**
	 * 奇数行で背景色
	 */
	public static final String SORT_MEISAIROW2CSS = "meisaiRow2Css";

	/**
	 * 奇数行で背景色(スマホ用)
	 */
	public static final String SORT_MEISAICOLOR1CSS = "color1";

	/**
	 * 偶数行で背景色(スマホ用)
	 */
	public static final String SORT_MEISAICOLOR2CSS = "color2";

	/**
	 * 差異あり背景色(スマホ用)
	 */
	public static final String SAI_ARICSS = "saiAri";

	/**
	 * 偶数行で背景色(スマホ用)
	 */
	public static final String LAYOUT_PATH_S = "/layout/layoutS.html";

	/**
	 * 明細最大チェック件数(スマホ用)
	 */
	public static final int MAX_MEISAICNT_S = 100;

	/**
	 * 1ページの件数.
	 */
	public static final int PAGE_SIZE = 6;

	/**
	 * 該当ページの前後に表示するリンクの範囲.
	 */
//	public static final int PAGE_RANGE_SIZE = 2;

	/**
	 * 本社の店舗コード(0090)
	 */
	public static final String HONSHA_CD = "0090";

	//*************************画面用定数定義領域　END*******************


	//*************************業務機能用定数定義領域　START*************

	/**
	 * 画面状態（初期）.
	 */
	public static final String SCREEN_STATE_INIT = "init";

	/**
	 * ソート.
	 */
	public static final String SCREEN_STATE_SORT = "SORT_STATE";

	/**
	 * SEARCH.
	 */
	public static final String SCREEN_STATE_SEARCH = "SEARCH_STATE";

	/**
	 * 昇順.
	 */
	public static final String SORT_ASC = "ASC";

	/**
	 * 明細レコード区分.
	 */
	public static final String DETAIL_RECORD_KBN_S = "S";

	/**
	 * 明細レコード区分（削除）.
	 */
	public static final String DETAIL_RECORD_KBN_D = "D";

	/**
	 * 明細レコード区分（追加）.
	 */
	public static final String DETAIL_RECORD_KBN_A = "A";

	/**
	 * 明細レコード区分（更新）.
	 */
	public static final String DETAIL_RECORD_KBN_U = "U";

	/**
	 * 明細レコード区分（追加→削除）.
	 */
	public static final String DETAIL_RECORD_KBN_AD = "AD";

	/**
	 * 一覧反映.
	 */
	public static final String BTN_INSERT = "INS";

	/**
	 * 更新.
	 */
	public static final String BTN_UPDATE = "UPD";

	/**
	 * 削除／行削除.
	 */
	public static final String BTN_DELETE = "DEL";

	/**
	 * 新規／行追加.
	 */
	public static final String BTN_ADD = "ADD";

	/**
	 * 個別.
	 */
	public static final String BTN_OTHER = "OTH";

	/**
	 * 印刷.
	 */
	public static final String BTN_PRINT = "PNT";

	/**
	 * CSV出力.
	 */
	public static final String BTN_OUTPUT_CSV = "CSV";

	/**
	 * 画面起動.
	 */
	public static final String SCREEN_RUN = "RUN";

	/**
	 * ファイル拡張子（.csv）.
	 */
	public static final String KAKUTYOSI_CSV = ".csv";

	/**
	 * ファイル拡張子（.pdf）.
	 */
	public static final String KAKUTYOSI_PDF = ".pdf";

	/**
	 * 文字コード（Windows-31J）.
	 */
	public static final String ENCODE_Windows31J = "Windows-31J";

	/**
	 * 文字コード（ISO-8859-1）.
	 */
	public static final String ENCODE_ISO88591 = "ISO-8859-1";

	/**
	 * 文字コード（\n）.
	 */
	public static final String KAIGYOU = "\n";

	/**
	 * 更新フラグ（あり）.
	 */
	public static final String UPDATEFLG_YES = "1";

	/**
	 * 更新フラグ（なし）.
	 */
	public static final String UPDATEFLG_NO = "0";

	//*************************業務機能用定数定義領域　END**************


	//*************************DB定数定義領域　START********************

	/**
	 * 削除区分(論理削除)
	 */
	public static final String DEL_KBN = "1";

	/**
	 * 単一区分(代表レコード)
	 */
	public static final String TANITSUKBN_DAIHYO = "1";

	/**
	 * 削除区分
	 */
	public enum DELETE_KBN implements EnumBehaviour  {

		NORMAL("0","通常"), 		//"0"：通常
		DELETE("1", "削除") ;		//"1"：削除

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private DELETE_KBN(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}

	}

	/**
	 * 諸コードマスタ定数
	 */
	public enum SHOCDMST_TEISU  {

		TENKBN("店区分"),
		GENSINKBN("現新区分"),
		YUKOKBN("有効店区分"),
		SINTENKBN("新店区分"),
		KYUTENKBN("休店区分"),
		JIDOSYUKAKBN("自動出荷区分"),
		TANMATSUKBN("端末区分"),
		SSHIMUKEGINKO("仕向銀行");

		// 区分値
	    private String teisu;

	    // コンストラクター
	    private SHOCDMST_TEISU(String _teisu) {
	        this.teisu = _teisu;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.teisu;
	    }
	}

	/**
	 * 業者区分
	 */
	public enum GYOSHA_KBN implements EnumBehaviour  {

		// "1"：運送業者
		UNSOUGYOUMONO("1", "運送業者"),

		// "2"：商品加工業者
		SYOUHINKAKOUMONO("2", "商品加工業者"),

		// "3"：ゴミ処理業者
		GOMISYORIMONO("3", "ゴミ処理業者"),

		// "4"：その他
		SONOTA("4", "その他"),

		// "9"：臨時社員
		RINJISHAIN("9","臨時社員");

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private GYOSHA_KBN(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}
	}

	/**
	 * 支払日区分
	 */
	public enum SHIHARAIDAY_KBN implements EnumBehaviour  {

		// "1"：10日
		JYUDAY("1", "10日"),

		// "2"：20日
		NIJYUDAY("2", "20日"),

		// "3"：月末
		GETUMATUDAY("3", "月末");

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private SHIHARAIDAY_KBN(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}
	}

	/**
	 * 振込手数料区分
	 */
	public enum FURIKOMICHARGE_KBN implements EnumBehaviour  {

		// "1"：先方負担
		GYOUSYAFUTAN("1", "先方負担"),

		// "2"：当社負担
		TOUSYAFUTAN("2", "当社負担");

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private FURIKOMICHARGE_KBN(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}
	}

	/**
	 * 口座区分
	 */
	public enum KOZASBT implements EnumBehaviour  {

		// "1"：普通
		NORMAL("1", "普通"),

		// "2"：当座
		TOUZA("2", "当座");

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private KOZASBT(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}
	}

	/**
	 * 諸コード名称定数
	 */
	public enum SHOCDMST_NM  {


		NM_SOTOZEI("外税");

		// 区分値
	    private String nm;

	    // コンストラクター
	    private SHOCDMST_NM(String _nm) {
	        this.nm = _nm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.nm;
	    }
	}

	/**
	 * 採番種別
	 */
	public static final String SAIBAN_SBT20 = "20";

	/**
	 * 採番種別"10"
	 */
	public static final String SAIBAN_SBT10 = "10";

	/**
	 * 採番種別
	 */
	public static final String SAIBAN_SBT30 = "30";

	/**
	 * 採番種別
	 */
	public static final String SAIBAN_SBT70 = "70";

	/**
	 * 採番種別
	 */
	public static final String SAIBAN_SBT05 = "05";

	/**
	 * 採番種別
	 */
	public static final String SAIBAN_SBT50 = "50";

	/**
	 * 採番種別
	 */
	public static final String SAIBAN_SBT51 = "51";

	/**
	 * 採番種別
	 */
	public static final String SAIBAN_SBT52 = "52";

	/**
	 * 採番種別
	 */
	public static final String SAIBAN_SBT71 = "71";

	/**
	 * 採番種別
	 */
	public static final String SAIBAN_SBT90 = "90";

	/**
	 * 発注番号採番キー
	 */
	public static final String HASI_KEYID = "810";

	/**
	 * 発注番号採番シーケンス区分
	 */
	public enum HASISEQ_KBN  {

		ORDERSEQ("1"),			// 発注シーケンス
		REQORDERSEQ("2"),		// 依頼発注シーケンス
		HENPINSEQ("3"),  		// 返品番号シーケンス
		JIDOORDER("4"),			// 自動発注シーケンス
		TOKUTEISHOHIN("5"),		//特定商品シーケンス
		DENPYONO("6");			//伝票番号シーケンス

		// 区分値
	    private String code;

	    // コンストラクター
	    private HASISEQ_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 業務区分(ＨＴヘッダファイル)
	 */
	public enum GYOMU_KBN implements EnumBehaviour  {

		NYUKA("1","入荷"), 		//"1"：入荷
		HENPIN("2", "返品"), 		//"2"：返品
		NYUKO("3", "入庫"),			//"3"：入庫
		SYUKO("4", "出庫"),			//"4"：出庫
		TEKYO("5", "撤去"),			//"5"：撤去
		TANAOROSI("6", "棚卸"),		//"6"：棚卸
		POP("7", "ＰＯＰ"),			//"7"：ＰＯＰ
		NYUKO_SYUKA("8", "入庫（出荷ラベル）"),	//"8"：入庫（出荷ラベル）
		NYUKA_SCMNO("9", "入荷（ＳＣＭ箱）"),	//"9"：入荷（ＳＣＭ№）
		NYUKA_SCMNOLST("A", "入荷（ＳＣＭ明細）");//"A"：入荷（ＳＣＭ№明細）

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private GYOMU_KBN(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}

	}

	/**
	 * 状態区分(ＨＴヘッダファイル)
	 */
	public enum STATUS_KBN implements EnumBehaviour  {

		MITORIKOMI("0","未取込"), 		//"0"：未取込
		TORIKOMIZUMI("1", "取込済"), 		//"1"：取込済
		ERROR("2", "エラー");			//"2"：エラー

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private STATUS_KBN(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}

	}

	/**
	 * エラー区分(ＨＴファイルＳＣＭ)
	 */
	public enum ERROR_KBN implements EnumBehaviour  {

		TENPOTIGAI("1","店舗違い"), 			//"1"：店舗違い
		ASNNASHI("2", "ＡＳＮなし"), 			//"2"：ASNなし
		SUTIGAI("3", "数量違い"),			//"3"：数量違い
		RESSUMINUS("4", "実績数マイナス"),		//"4"：実績数ﾏｲﾅｽ
		JANMISONZAI("5", "ＪＡＮコードマスタ未存在"),	//"5"：JANｺｰﾄﾞﾏｽﾀ未存在
		SOUKONYUKA("6", "倉庫入荷"),			//"6"：倉庫入荷
		GYOMUTIGAI("7", "業務違い"),			//"7"：業務違い
		YOTEINASHI("8", "予定なし");			//"8"：予定なし

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private ERROR_KBN(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}

	}

	/**
	 * 取消区分(ＨＴファイルＳＣＭ)
	 */
	public enum CANCELKBN implements EnumBehaviour  {

		CANCEL("1","取消"); 			//"1"：取消

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private CANCELKBN(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}

	}

	/**
	 * 識別子(ＪＡＮコードマスタ)
	 */
	public enum IDT  {


		JAN13_EAN("1"),	//"1"：JAN13桁･EAN･UPC-A
		JAN8("6"),		//"6":JAN8桁
		UPC_E("7"),		//"7"：UPC-E
		IDT_8("8"),		//"8"：8
		IDT_9("9");		//"9"：9

		// 区分値
	    private String idtCode;

	    // コンストラクター
	    private IDT(String _idtCode) {
	        this.idtCode = _idtCode;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.idtCode;
	    }
	}

	/**
	 * 業態(業態マスタ)
	 */
	public enum GYOTAI implements EnumBehaviour  {

		AP("21", "ＡＰ"),		//"21"：AP
		G5("22", "Ｇ５"),		//"22":G5
		SD("23", "ＳＤ"),		//"23":SD
		SOKO("31", "倉庫");	//"31"：倉庫

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private GYOTAI(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 国内海外区分(仕入先マスタ)
	 */
	public enum KOKUNAIKAIGAI_KBN  {

		KOKUNAI("0"),		//"0":国内
		KAIGAI("1");		//"1"：海外

		// 区分値
	    private String code;

	    // コンストラクター
	    private KOKUNAIKAIGAI_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 買掛未払区分(仕入先マスタ)
	 */
	public enum URIKAKEMIHARAI_KBN  {

		URIKAKE("0"),		//"0"：売掛
		MISIHARAI("9");		//"9"：見払

		// 区分値
	    private String code;

	    // コンストラクター
	    private URIKAKEMIHARAI_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 社員区分(社員マスタ)
	 */
	public enum SHAIN_KBN implements  EnumBehaviour {

		NORMAL_SHAIN("0", "社員"),		//"0"：社員
		RINJI_SHAIN("9", "臨時社員");		//"9"：臨時社員

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private SHAIN_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 臨社区分(社員マスタ)
	 */
	public enum RINSHA_KBN  {

		PART("1"),		//"1"：パート
		Arbeit("2");	//"2"：アルバイト

		// 区分値
	    private String code;

	    // コンストラクター
	    private RINSHA_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 職位区分(社員マスタ)
	 */
	public enum SHOKUI_KBN  implements  EnumBehaviour  {

		LEADER("1", "リーダー"),	//"1"：リーダー
		ASISTANT("2", "アシスタント"),	//"2"：アシスタント
		STUFF("3", "スタッフ");		//"3"：スタッフ

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private SHOKUI_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 店長店代区分(社員マスタ)
	 */
	public enum TENCHO_KBN  {

		TENCHO_NO("0"),		//"0"：店長・店代以外
		TENCHO_YES("1");	//"1"：店長・店代

		// 区分値
	    private String code;

	    // コンストラクター
	    private TENCHO_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * Ａ１区分(社員マスタ)
	 */
	public enum A1_KBN  {

		OVER_A1("1"),	//"1"：A1以上
		UNDER_B3("2");	//"2"：B3以下

		// 区分値
	    private String code;

	    // コンストラクター
	    private A1_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 高校生フラグ(社員マスタ)
	 */
	public enum KOKOSEI_FLG  {

		KOKOSEI_NO("0"),	//"0"：高校生以外
		KOKOSEI_YES("1");	//"1"：高校生

		// 区分値
	    private String code;

	    // コンストラクター
	    private KOKOSEI_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 勤労学生フラグ(社員マスタ)
	 */
	public enum KINRO_FLG  {

		KINRO_NO("0"),	//"0"：勤労学生以外
		KINRO_YES("1");	//"1"：勤労学生

		// 区分値
	    private String code;

	    // コンストラクター
	    private KINRO_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 通勤区分(社員マスタ)
	 */
	public enum TSUKIN_KBN  {

		KOUTUKIKAN("1"),	//"1"：公共機関
		KURUMA("2"),		//"2"：車
		ARUKU("3");			//"3"：徒歩

		// 区分値
	    private String code;

	    // コンストラクター
	    private TSUKIN_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 提出フラグ(社員マスタ)
	 */
	public enum TEISYUTU_FLG  {

		MITEISYUTU("0"),	//"0"：未提出
		TEISYUTUSUMI("1");	//"1"：提出済

		// 区分値
	    private String code;

	    // コンストラクター
	    private TEISYUTU_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 扶養控除調整フラグ(社員マスタ)
	 */
	public enum FUYOKOJOTYOSEI_FLG  {

		NASI("0"),	//"0"：なし
		ARI("1");	//"1"：あり

		// 区分値
	    private String code;

	    // コンストラクター
	    private FUYOKOJOTYOSEI_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 性別(社員マスタ)
	 */
	public enum SEBETU_KBN  {

		DANSEI("1"),	//"1"：男性
		JYOSEI("2");	//"2"：女性

		// 区分値
	    private String code;

	    // コンストラクター
	    private SEBETU_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 本部更新識別(社員マスタ)
	 */
	public enum HONU_UPD_KBN  {

		MITOROKU("0"),	//"0"：未登録
		TOROKU("1");	//"1"：登録

		// 区分値
	    private String code;

	    // コンストラクター
	    private HONU_UPD_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 有効区分（社員マスタ）
	 */
	public enum YUKO_KBN_SHAIN  {

		YUKO("1"),		//"1":有効
		MUKO ("9");		//"9"：無効

		// 区分値
	    private String code;

	    // コンストラクター
	    private YUKO_KBN_SHAIN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 在庫区分
	 */
	public enum ZAIKO_KBN implements EnumBehaviour  {

		HANBAI("1", "販売"),		//"1"：販売
		TORIOKI("2", "取置"),		//"2":取置
		FURYOHIN("3", "不良品"),	//"3":不良品
		SIDAHIN("4", "試打品"),		//"4"：試打品
		TEKKYO("5", "撤去");		//"5"：撤去

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private ZAIKO_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 振替在庫区分
	 */
	public enum FURIKAEMOTO_ZAIKO_KBN implements EnumBehaviour {

		HANBAI("1", "販売"), // "1"：販売
		TORIOKI("2", "取置"), // "2":取置
		FURYOHIN("3", "不良品"), // "3":不良品
		SIDAHIN("4", "試打品"),		//"4"：試打品
		TEKKYO("5", "撤去"); // "5"：撤去中

		// コード
		private String code;
		// 名称
		private String meisyo;

		// コンストラクター
		private FURIKAEMOTO_ZAIKO_KBN(String _code, String _meisyo) {
			this.code = _code;
			this.meisyo = _meisyo;
		}

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 定率フラグ(在庫管理せず)
	 */
	public static final String TEIRITU_NOTKANRI = "B";

	/**
	 * 定率フラグ(在庫引落ししない(在庫管理識別子))
	 */
	public static final String TEIRITSU_FLG_HIKIOTOSINAI = "B";

	/**
	 * 定率フラグ(在庫引落ししない(在庫管理識別子))
	 */
	public static final String TEIRITSU_FLG_HIKIOTOSINAI_NAME = "在庫引落ししない";

	/**
	 * 出庫元有効在庫更新フラグ(出庫ファイル)
	 */
	public enum SHUKOMOTOYUKOZAIKO_UPD_FLG  {

		MIKOSIN("0"),	//"0"：未更新
		KOSINSUMI("1");	//"1"：更新済み

		// 区分値
	    private String code;

	    // コンストラクター
	    private SHUKOMOTOYUKOZAIKO_UPD_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 出庫確定区分(出庫ファイル)
	 */
	public enum SHUKO_KAKUTEI_KBN_SHUKO  {

		MIKAKUTEI("0"),		//"0"：未確定
		KENHINTYU("1"),		//"1"：検品中
		KAKUTEISUMI("2");	//"2"：確定済

		// 区分値
	    private String code;

	    // コンストラクター
	    private SHUKO_KAKUTEI_KBN_SHUKO(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 出庫確定区分(出庫ファイル)
	 */
	public enum SHUKO_KAKUTEI_KBN_SHUKOHDR implements EnumBehaviour {

		MIKAKUTEI("0", "未出庫"),		//"0"：未出庫
		KENHINTYU("1", "出庫中"),		//"1"：出庫中
		KAKUTEISUMI("2", "出庫済");		//"2"：出庫済

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private SHUKO_KAKUTEI_KBN_SHUKOHDR(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			// コード
			return this.code;
		}

		@Override
		public String getName() {
			// 名称
			return this.name;
		}
	}

	/**
	 * 更新識別(出庫ファイル)
	 */
	public enum UPD_FLG  {

		MIKOSIN("0"),	//"0"：未更新
		KOSINSUMI("1");	//"1"：更新済み

		// 区分値
	    private String code;

	    // コンストラクター
	    private UPD_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 入力識別
	 */
	public enum INPUT_IDT  {

		HOST("0"),		//"0"：ホスト
		HONBU("1"),		//"1"：本部
		JITENPO("2"),	//"2"：自店舗
		TATENPO("3");	//"3"：他店舗

		// 区分値
	    private String code;

	    // コンストラクター
	    private INPUT_IDT(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 移動区分
	 */
	public enum IDO_KBN  {

		IDO("0"),			//"0"：移動
		MAKERHENPIN("1"),	//"1"：ﾒｰｶｰ返品
		DOUSOU("2"),		//"2"：同送
		BAIYAKU("3"),		//"3"：売約
		KYAKUTYU("4");		//"4"：客注

		// 区分値
	    private String code;

	    // コンストラクター
	    private IDO_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 入庫登録識別(出庫ファイル)
	 */
	public enum NYUKOREG_IDT  {

		MITOROKU("0"),	//"0"：未登録
		TOROKU("1");	//"1"：登録

		// 区分値
	    private String code;

	    // コンストラクター
	    private NYUKOREG_IDT(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 売変後区分(商品マスタ)
	 */
	public enum BAIHENGO_KBN  {

		NOT_BAIHEN("0"),	//"0"：売変なし
		STC_BAIHEN("1"),	//"1"：STC売変
		HONBU_BAIHEN("3");	//"3"：本部売変

		// 区分値
	    private String code;

	    // コンストラクター
	    private BAIHENGO_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 税番号(商品マスタ)
	 */
	public enum ZEI_BANGO implements EnumBehaviour {

		GAIZEI("01", "外税"),	//"01"：外税
		NAIZEI("02", "内税"),	//"02"：内税
		HIKAZEI("03", "非課税");	//"03"：非課税

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private ZEI_BANGO(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.name;
		}
	}

	/**
	 * 価格入力指示(商品マスタ)
	 */
	public enum PRICE_INPUT_SHIJI implements EnumBehaviour {

		SINAI("0", "指示しない"),	//"0"：指示しない
		SURU("1", "指示する");	//"1"：指示する

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private PRICE_INPUT_SHIJI(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 価格確認(商品マスタ)
	 */
	public enum PRICE_KAKUNIN implements EnumBehaviour {

		SINAI("0", "確認しない"),	//"0"：確認しない
		SURU("1", "確認する");	//"1"：確認する

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private PRICE_KAKUNIN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 商品区分(商品マスタ)
	 */
	public enum SHOHIN_KBN implements EnumBehaviour {

		PROVER("1", "プロバー"),		//"1"：プロバー
		ORIGINAL("2", "オリジナル"),		//"2"：オリジナル
		NOTWARIBIKI("3", "従業員割引対象外");	//"3"：従業員割引対象外

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private SHOHIN_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 返品可否フラグ(商品マスタ)
	 */
	public enum HENPINKAHI_FLG implements EnumBehaviour {

		OK("0", "可"),		//"0"：可
		NG("1", "否");		//"1"：否

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private HENPINKAHI_FLG(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 販売可否フラグ(商品マスタ)
	 */
	public enum HANBAIKAHI_FLG implements EnumBehaviour {

		OK("0", "可"),		//"0"：可
		NG("1", "否");		//"1"：否

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private HANBAIKAHI_FLG(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 加工フラグ(商品マスタ)
	 */
	public enum KAKO_FLG implements EnumBehaviour{

		SHOHIN("0", "商品"),	//"0"：商品
		KAKO("1", "加工");		//"1"：加工

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KAKO_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.name;
		}
	}

	/**
	 * 上代区分(商品マスタ)
	 */
	public enum JODAI_KBN implements EnumBehaviour{

		MAKER("1", "ナーカ"),	//"1"：ﾒｰｶ
		YUNYU("2", "輸入"),	//"2"：輸入
		NASI("3", "なし"),	//"3"：なし
		JITEN("4", "自店");	//"4"：自店

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private JODAI_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.name;
		}
	}

	/**
	 * 表示区分(商品マスタ)
	 */
	public enum HYOJI_KBN implements EnumBehaviour{

		NIJYUHYOUJIOK("1", "二重売価　割引表示ＯＫ"),	//"1"：二重売価　割引表示OK
		BAIKANOMI("2", "売価表示のみ『スバリ』"),		//"2"：売価表示のみ『ｽﾊﾞﾘ』
		WARIBIKI("3", "割引致します"),		//"3"：割引致します
		OLDMODEL("4", "旧モデル");		//"4"：旧ﾓﾃﾞﾙ

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private HYOJI_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.name;
		}
	}

	/**
	 * ノベリティフラグ(商品マスタ)
	 */
	public enum NOVEL_FLG implements EnumBehaviour {

		NORMAL_GOODS("0", "通常商品"),	//"0"：通常商品
		NOVEL_GOODS("1", "バリティグッズ付き商品");		//"1"：ﾉﾍﾞﾘﾃｨｸﾞｯｽﾞ付き商品

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private NOVEL_FLG(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 割引区分(商品マスタ)
	 */
	public enum WARIBIKI_KBN implements EnumBehaviour {

		NOSETTING("0", "設定なし"),			//"0"：設定なし
		WARIBIKI("1", "割引"),			//"1"：割引
		HENGAN("2", "還元"),			//"2"：還元
		KINGAKU_WARIBIKI("3", "金額引"),	//"3"：金額引
		ZUBARI("4", "ズバリ");			//"4"：ｽﾞﾊﾞﾘ

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private WARIBIKI_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.name;
		}
	}

	/**
	 * セット割引区分(商品マスタ)
	 */
	public enum SETWARIBIKI_KBN {

		NOSETTING("0"),			//"0"：設定なし
		WARIBIKI("1"),			//"1"：割引
		HENGAN("2"),			//"2"：還元
		KINGAKU_WARIBIKI("3"),	//"3"：金額引
		ZUBARI("4");			//"4"：ｽﾞﾊﾞﾘ

		// 区分値
	    private String code;

	    // コンストラクター
	    private SETWARIBIKI_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 預り品フラグ(商品マスタ)
	 */
	public enum ATUKARI_FLG implements EnumBehaviour {

		NORMAL("0", "通常品"),			//"0"：通常品
		ATUKARI("1", "預り加工品");			//"1"：預り加工品

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private ATUKARI_FLG(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 中古品フラグ(中古品)
	 */
	public static final String THUKOHIN_FLG = "1";

	/**
	 * 中古品フラグ(中古品)
	 */
	public static final String THUKOHIN_FLG_NAME = "中古品";

	/**
	 * 中古品フラグ(通常品)
	 */
	public static final String THUKOHIN_FLG_NORMAL_NAME = "通常品";

	/**
	 * ＡＰＪＰ区分(商品マスタ)
	 */
	public enum APJP_KBN implements EnumBehaviour {

		NORMAL("A", "ＡＰ"),			//"A"：AP
		ATUKARI("J", "ＪＰ");			//"J"：JP

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private APJP_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.name;
		}
	}

	/**
	 * 税率区分(商品マスタ)
	 */
	public enum ZEIRITSU_KBN implements EnumBehaviour {

		PERCENT5("1", "５％課税"),			//"1"：5%課税
		PERCENT7("2", "７％課税");			//"2"：7%課税

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private ZEIRITSU_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.name;
		}
	}

	/**
	 * メンテナンス区分(商品マスタ)
	 */
	public enum MNT_KBN implements EnumBehaviour {

		SHOHIN_MNT("0", "商品マスタメンテナンス"),		//"0"：商品ﾏｽﾀﾒﾝﾃﾅﾝｽ
		SHOHIN_LOAD("1", "商品データロード"),		//"1"：商品ﾃﾞｰﾀﾛｰﾄﾞ
		HOST_RENKEI("2", "ホスト連携"),		//"2"：ﾎｽﾄ連携
		SIDAHIN("5", "試打品");			//"5"：試打品

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private MNT_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * メンテナンス区分(在庫更新履歴ファイル)
	 */
	public enum MNT_KBN_ZAIKO implements EnumBehaviour {

		SHOHIN_LOAD("1", "在庫マスタメンテナンス"),		//"1"：在庫ﾏｽﾀﾒﾝﾃﾅﾝｽ
		ZAIKOTEISEI("2", "在庫訂正");			//"2"：在庫訂正

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private MNT_KBN_ZAIKO(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * セット区分(商品マスタ)
	 */
	public enum SET_KBN implements EnumBehaviour {

		TANPIN("0", "単品"),		//"0"：単品
		SETHIN("1", "セット品");		//"1"：ｾｯﾄ品

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private SET_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 発注本部承認フラグ(商品マスタ)
	 */
	public enum ORDERHNBAPP_FLG implements EnumBehaviour {

		ARI("0", "承認あり"),		//"0"：承認あり
		NASI("1", "承認なし");		//"1"：承認なし

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private ORDERHNBAPP_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
	    public String getCode() {
	    	// コード
			return this.code;
		}

	    @Override
		public String getName() {
	    	// 名称
			return this.name;
		}
	}

	/**
	 * 性別(商品マスタ)
	 */
	public enum SEBETU_KBN_MSHOM implements EnumBehaviour  {

		DANSEI("1", "メンズ"),		//"1"：男性
		JYOSEI("2", "レディース");	//"2"：女性

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private SEBETU_KBN_MSHOM(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
	    public String getCode() {
	    	// コード
			return this.code;
		}

	    @Override
		public String getName() {
	    	// 名称
			return this.name;
		}
	}

	/**
	 * 返品本部承認フラグ(商品マスタ)
	 */
	public enum HEMPINHNBAPP_FLG implements EnumBehaviour {

		ARI("0", "承認あり"),		//"0"：承認あり
		NASI("1", "承認なし");		//"1"：承認なし

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private HEMPINHNBAPP_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
	    public String getCode() {
	    	// コード
			return this.code;
		}

	    @Override
		public String getName() {
	    	// 名称
			return this.name;
		}
	}

	/**
	 * 完了フラグ(商品マスタ)
	 */
	public enum KANRYO_FLG implements EnumBehaviour {

		MIKANRYO("0", "未完了"),		//"0"：未完了
		KANRYO("1", "完了");			//"1"：完了

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KANRYO_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
	    public String getCode() {
	    	// コード
			return this.code;
		}

	    @Override
		public String getName() {
	    	// 名称
			return this.name;
		}
	}

	/**
	 * 削除区分(商品マスタ)
	 */
	public enum DELETE_KBN_MSHOM implements EnumBehaviour  {

		NORMAL("0","有効"), 		//"0"：有効
		DELETE("1", "削除") ;		//"1"：削除


		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private DELETE_KBN_MSHOM(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}

	}
	/**
	 * ＰＢ管理フラグ(商品マスタ)
	 */
	public enum PBKANRI_FLG implements EnumBehaviour {

		TAISYOGAI("0", "対象外"),		//"0"：対象外
		TAISYO("1", "対象");		//"1"：対象

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private PBKANRI_FLG(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}
	}

	/**
	 * 発注禁止フラグ(商品マスタ)
	 */
	public enum ORDERNG_FLG implements EnumBehaviour {

		TAISYOGAI("0", "対象外"),		//"0"：対象外
		TAISYO("1", "対象");		//"1"：対象

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private ORDERNG_FLG(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}
	}

	/**
	 * 差分抽出フラグ(商品マスタ)
	 */
	public enum DFEXT_FLG  {

		MIEXT("0"),     //"0"：未抽出
		EXTZUMI("1");   //"1"：抽出済

		// 区分値
	    private String code;

	    // コンストラクター
	    private DFEXT_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 指示区分
	 */
	public enum SHIJI_KBN implements EnumBehaviour{

		SURYOUSHIJI("0", "数量指示"),		//"0"：数量指示
		ZENBU("9", "全部");				//"9"：全部

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private SHIJI_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
	    public String getCode() {
	    	// コード
			return this.code;
		}

	    @Override
		public String getName() {
	    	// 名称
			return this.name;
		}
	}

	/**
	 * 指示識別
	 */
	public enum SHIJI_IDT implements EnumBehaviour{

		HINBANSHITEI("0", "品番"),		//"0"：品番指定
		MOJISHITEI("1" ,"文字");		//"1"：文字指定

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private SHIJI_IDT(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
	    public String getCode() {
	    	// コード
			return this.code;
		}

	    @Override
		public String getName() {
	    	// 名称
			return this.name;
		}

	}

	/**
	 * 登録識別(撤去指示ファイル)
	 */
	public enum REG_IDT  {

		HONBUNEW("0"),			//"0"：本部新規
		HONBUDATALOAD("1"),		//"1"：本部ﾃﾞｰﾀﾛｰﾄﾞ
		HOST("2");				//"2"：ホスト

		// 区分値
	    private String code;

	    // コンストラクター
	    private REG_IDT(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 店出・横持区分(出荷ラベルＩＤファイル、エリアＴＣＳＣＭラベルファイル)
	 */
	public enum TKSYOHIN_KBN  {

		TNSYO("0"),			//"0"：店出し
		YKMT("1");		    //"1"：横持ち

		// 区分値
	    private String code;

	    // コンストラクター
	    private TKSYOHIN_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 経由・出庫区分(出荷ラベルＩＤファイル、エリアＴＣＳＣＭラベルファイル)
	 */
	public enum KEIYUSYKO_KBN implements EnumBehaviour {

		KEIYU("1", "経由"),			//"1"：経由
		SYKO("2", "出庫");		    //"2"：出庫

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KEIYUSYKO_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 確定区分(撤去指示ファイル、店間移動指示ファイル、店間移動指示ヘッダファイル、本社指示予定ファイル)
	 */
	public enum KAKUTEI_KBN_TTKSIJI  implements EnumBehaviour  {

		SHIJIMI("0", "未指示"),			//"0"：未指示
		SHIJITYU("1", "指示中"),		//"1"：指示中
		SHIJIZUMI("2", "指示済");		//"2"：指示済

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private KAKUTEI_KBN_TTKSIJI(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 確定区分(撤去出庫ファイル、撤去出庫ヘッダファイル)
	 */
	public enum KAKUTEI_KBN_TTKSYKO  implements EnumBehaviour  {

		SHIJIMI("0", "未確定"),			//"0"：未確定
		SHIJITYU("1", "撤去中"),			//"1"：撤去中
		SHIJIZUMI("2", "撤去済");		//"2"：撤去済

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private KAKUTEI_KBN_TTKSYKO(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 確定区分(撤去指示予定ファイル)
	 */
	public enum KAKUTEI_KBN_TTKSJYT  implements EnumBehaviour  {

		SHIJIMI("0", "未指示"),					//"0"：未指示
		SHIJIYIRAITYU("1", "指示中"),		    //"1"：指示中
		SHIJIZUMI("2", "指示済"),				//"2"：指示済
		SHIJIYIRAIZUMI("3", "確定済");		    //"3"：確定済
		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private KAKUTEI_KBN_TTKSJYT(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * セットフラグ
	 */
	public enum S_FLG {

		TANPIN("0"),			//"0"：単品
		SETHIN("1");			//"1"：ｾｯﾄ品

		// 区分値
	    private String code;

	    // コンストラクター
	    private S_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 在庫更新フラグ
	 */
	public enum ZAIKO_UPD_FLG  {

		MIKOSIN("0"),	//"0"：未更新
		KOSINSUMI("1");	//"1"：更新済み

		// 区分値
	    private String code;

	    // コンストラクター
	    private ZAIKO_UPD_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 登録識別(店間移動指示ファイル)
	 */
	public enum REG_IDT_TTIDOS  {

		HONBUN("0"),			//"0"：本部
		HOST("1");				//"1"：ホスト

		// 区分値
	    private String code;

	    // コンストラクター
	    private REG_IDT_TTIDOS(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 単品指定(店間移動指示ファイル, 本社指示予定ファイル)
	 */
	public enum TAMPIN_SHITEI  implements EnumBehaviour {

		HINBANSHITEI("0", "品番"),		//"0"：品番指定
		TAMPINSHITEI("1", "単品");		//"1"：単品指定

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private TAMPIN_SHITEI(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.name;
		}
	}

	/**
	 * 朝一出力フラグ(店間移動指示ファイル)
	 */
	public enum ASA_OUTPUT_FLG  {

		OUTMI("0"),		//"0"：未出力
		OUTZUMI("1");		//"1"：出力済

		// 区分値
	    private String code;

	    // コンストラクター
	    private ASA_OUTPUT_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 登録識別
	 */
	public enum SHUKKO_REGIDT  {

		MITOROKU("0"),		//"0"：未登録
		TOROKUZUMI("1");	//"1"：登録済

		// 区分値
	    private String code;

	    // コンストラクター
	    private SHUKKO_REGIDT(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 登録識別(店間移動指示ヘッダファイル)
	 */
	public enum REG_IDT_TTIDOSHD  {

		HONBUN("0"),			//"0"：本部
		HOST("1");				//"1"：ホスト

		// 区分値
	    private String code;

	    // コンストラクター
	    private REG_IDT_TTIDOSHD(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 業態(店舗マスタ)
	 */
	public enum GYOTAI_MTENP implements EnumBehaviour  {

		HONSYA("11", "本社"),		//"11"：本社
		AP("21", "ＡＰ"),		//"21"：AP
		G5("22", "Ｇ５"),		//"22":G5
		SD("23", "ＳＤ"),		//"23":SD
		MF("24", "ＭＦ"),		//"24":MF
		SOKO("31", "倉庫"),	//"31"：倉庫
		SONOTA("91", "その他");	//"91"：その他

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private GYOTAI_MTENP(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 店区分(店舗マスタ)
	 */
	public enum TEMPO_KBN  {

		TEMPO("0"),	//"0"：店舗
		SOKO("1"),	//"1"：倉庫
		SONOTA("2"),	//"2"：その他
		HONBU("4");	//"4"：本部

		// 区分値
	    private String code;

	    // コンストラクター
	    private TEMPO_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 現新区分(店舗マスタ)
	 */
	public enum GENSHIN_KBN  {

		H("0"),	//"0"：H店
		F("1");	//"1"：F店

		// 区分値
	    private String code;

	    // コンストラクター
	    private GENSHIN_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 有効店区分(店舗マスタ)
	 */
	public enum YUKO_TEMPO_KBN  {

		HAISIN("0"),	//"0"：配信対象
		HAISINGAI("1");	//"1"：配信対象外

		// 区分値
	    private String code;

	    // コンストラクター
	    private YUKO_TEMPO_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 新店区分(店舗マスタ)
	 */
	public enum SHINTEN_KBN  {

		SHINTENIGAI("0"),	//"0"：新店以外
		SHINTEN("1");	//"1"：新店

		// 区分値
	    private String code;

	    // コンストラクター
	    private SHINTEN_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 休店区分(店舗マスタ)
	 */
	public enum KYUTEN_KBN  {

		EIGYOTYU("0"),	//"0"：営業中
		KYUTEN("1");	//"1"：休店

		// 区分値
	    private String code;

	    // コンストラクター
	    private KYUTEN_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 自動出荷区分(店舗マスタ)
	 */
	public enum JIDO_SHUKKA_KBN  {

		YES("0"),	//"0"：自動出荷指示する
		NO("1");	//"1"：しない

		// 区分値
	    private String code;

	    // コンストラクター
	    private JIDO_SHUKKA_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 端末区分(店舗マスタ)
	 */
	public enum TERMINAL_KBN  {

		FUJITU("1"),	//"1"：富士通端末
		NEC("2"),	//"2"：NEC端末
		SONOTA("3");	//"3"：その他端末

		// 区分値
	    private String code;

	    // コンストラクター
	    private TERMINAL_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * ブロックセンタ区分(店舗マスタ)
	 */
	public enum BLOCKCENTER_KBN implements EnumBehaviour {

		BLOCKCENTERIGAI("0", "プロックセンタ以外"),	//"0"：ﾌﾞﾛｯｸｾﾝﾀ以外
		BLOCKCENTER("1", "プロックセンタ");			//"1"：ﾌﾞﾛｯｸｾﾝﾀ

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private BLOCKCENTER_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			// コード取得
			return this.code;
		}

		@Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 取引区分(入荷返品ファイル)
	 */
	public enum TORIHIKI_KBN implements EnumBehaviour {

		APSEIHINKOKUNAI("10", "製品国内"),	//"10"：製品国内
		APSEIHINKOKUNAI_HENHIN("30", "製品国内返品");	//"30"：製品国内返品

		// 区分値
	    /**
	     *
	     */
	    private String code;
	    private String name;

	    // コンストラクター
	    private TORIHIKI_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			// コード
			return this.code;
		}

		@Override
		public String getName() {
			// 名称
			return this.name;
		}
	}

	/**
	 * 取消区分(入荷返品ファイル)
	 */
	public enum CANCEL_KBN  {

		TUJYO("0"),	//"0"：通常
		CANCEL("1");	//"1"：取消

		// 区分値
	    private String code;

	    // コンストラクター
	    private CANCEL_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * セット区分(入荷返品ファイル)
	 */
	public enum SET_KBN_TNYKA {

		TANPIN("0"),		//"0"：単品
		SETHIN("1");			//"1"：ｾｯﾄ品

		// 区分値
	    private String code;

	    // コンストラクター
	    private SET_KBN_TNYKA(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 入荷トラン作成フラグ(入荷返品ファイル)
	 */
	public enum NYUKATRAN_SAKUSEI_FLG {

		SAKUSEIMI("0"),				//"0"：未作成
		SAKUSEIZUMI("1");			//"1"：作成済み

		// 区分値
	    private String code;

	    // コンストラクター
	    private NYUKATRAN_SAKUSEI_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 確定区分(入荷返品ファイル)
	 */
	public enum KAKUTEI_KBN_TNYKA implements EnumBehaviour  {

		MINYUKA("0", "未入荷/未返品"),		//"0"：未入荷/未返品
		KENHINTYU("1", "検品中"),			//"1":検品中
		KAKUTEI("2", "確定"),				//"2":確定
		SINYUKEIJYO("3", "仕入計上");		//"3"：仕入計上

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private KAKUTEI_KBN_TNYKA(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 予定在庫更新フラグ(入庫ファイル)
	 */
	public enum YOTEI_ZAIKO_UPD_FLG {

		MITOROKU("0"),		//"0"：未登録
		TOROKUZUMI("1");	//"1"：登録済

		// 区分値
	    private String code;

	    // コンストラクター
	    private YOTEI_ZAIKO_UPD_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 個口割れ使用フラグ(入庫ファイル)
	 */
	public enum KOGUCHI_WARE_USE_FLG {

		MITOROKU("0"),		//"0"：未登録
		TOROKUZUMI("1");	//"1"：登録済

		// 区分値
	    private String code;

	    // コンストラクター
	    private KOGUCHI_WARE_USE_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 個口割れフラグ(入庫ファイル)
	 */
	public enum KOGUCHI_WARE_FLG {

		WARENASI("0"),		//"0"：割れ無し
		WAREARI("1");	//"1"：割れ有り

		// 区分値
	    private String code;

	    // コンストラクター
	    private KOGUCHI_WARE_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 前回入庫確定済みフラグ(入庫ファイル)
	 */
	public enum ZENKAI_NYUKO_KAKUTEI_ZUMI_FLG {

		MINYUKO("0"),		//"0"：未入庫
		KENHINTYU("1"),		//"1"：検品中
		ITIBUNYUKO("2"),		//"2"：一部入庫
		NYUKOZU("3");		//"3"：入庫済

		// 区分値
	    private String code;

	    // コンストラクター
	    private ZENKAI_NYUKO_KAKUTEI_ZUMI_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 確定区分(入庫ファイル)
	 */
	public enum KAKUTEI_KBN_TNYKOYN implements EnumBehaviour{

		MINYUKO("0", "未入庫"),		//"0"：未入庫
		KENHINTYU("1", "入庫中"),		//"1"：検品中
		ITIBUNYUKO("2", "一部入庫"),		//"2"：一部入庫
		NYUKOZU("3", "入庫済");		//"3"：入庫済

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private KAKUTEI_KBN_TNYKOYN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 予定有無フラグ
	 */
	public enum YOTEI_UMU_FLG  {

		NASI("0"),			//"0"：予定無し
		ARI("1");	//"1"：予定有り

		// 区分値
	    private String code;

	    // コンストラクター
	    private YOTEI_UMU_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 客注抽出フラグ
	 */
	public enum KYAKU_EXT_FLG  {

		MIEXT("0"),     //"0"：未抽出
		EXTZUMI("1"),   //"1"：抽出済
		TAISYOGAI("9"); //"9"：対象外

		// 区分値
	    private String code;

	    // コンストラクター
	    private KYAKU_EXT_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 確定区分(入庫ヘッダファイル)
	 */
	public enum KAKUTEI_KBN_TNYKOHD implements EnumBehaviour {

		MINYUKO("0", "未入庫"),		//"0"：未入庫
		KENHINTYU("1", "検品中"),		//"1"：検品中
		ITIBUNYUKO("2", "一部入庫"),	//"2"：一部入庫
		NYUKOZU("3", "入庫済");		//"3"：入庫済

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KAKUTEI_KBN_TNYKOHD(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			// コード
			return this.code;
		}

		@Override
		public String getName() {
			// 名称
			return this.name;
		}
	}

	/**
	 * 赤黒区分
	 */
	public enum AKAKURO_KBN implements EnumBehaviour  {

		KURO("0", "黒"),		//"0"：黒
		AKA("1", "赤");		//"1"：赤

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private AKAKURO_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 状態区分
	 */
	public enum JYOTAI_KBN implements EnumBehaviour  {

		MITORIKOMI("0", "未確定"),		//"0"：未確定
		TORIKOMIZUMI("1", "取込済"),		//"1"：確定済
		ERROR("2", "エラー");		//"2"：エラー

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private JYOTAI_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}


	/**
	 * 状態区分(棚卸処理)
	 */
	public enum JYOTAI_KBN_TANAOROSI implements EnumBehaviour  {

		KAISHI("0", "開始"),			//"0"：開始
		TANAOROSITYU("1", "棚卸中"),	//"1"：棚卸中
		SHURYO("2", "終了");			//"2"：終了

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private JYOTAI_KBN_TANAOROSI(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 振替区分(経費振替ファイル)
	 */
	public enum FURIKAE_KBN implements EnumBehaviour  {

		SHOHINTOKEIHI("1", "商品から経費"),		//"1"：商品→経費
		KEIHITOSHOHIN("2", "経費から商品");		//"2"：経費→商品

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private FURIKAE_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * ホスト登録識別（経費振替ファイル）
	 */
	public enum HOSTREG_IDT_KHFURIKAE  {

		KEIHITRAN_MISAKUSEI("0"),	//"0":経費振替ﾄﾗﾝ未作成
		KEIHITRAN_SAKUSEISUMI("1");	//"1"：経費振替ﾄﾗﾝ作成済み

		// 区分値
	    private String code;

	    // コンストラクター
	    private HOSTREG_IDT_KHFURIKAE(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 受払履歴作成識別（経費振替ファイル）
	 */
	public enum UKEHARAI_SHIKIBETSU  {

		MISAKUSEI("0"),		//"0":未作成
		SAKUSEISUMI("1");	//"1"：作成済み

		// 区分値
	    private String code;

	    // コンストラクター
	    private UKEHARAI_SHIKIBETSU(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 発生区分（不良品在庫明細ファイル）
	 */
	public enum HASEI_KBN implements EnumBehaviour  {

		SCAN("1", "スキャン"),		//"1":スキャン
		SCREEN("2", "画面");	//"2"：画面

		// 区分値
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private HASEI_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 確定区分（不良品在庫明細ファイル）
	 */
	public enum KAKUTEIKBN_THURYOUHIN implements EnumBehaviour  {

//		MISHUKO("0", "未出庫"),		//0:未出庫
		MISHUKO("0", "出庫中"),	//0:出庫中
		SHUKOSUMI("2", "出庫済");	//2:出庫済

		// 区分値
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private KAKUTEIKBN_THURYOUHIN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 確定区分（出庫ヘッダファイル）
	 */
	public enum KAKUTEIKBN_TSYKOHD implements EnumBehaviour {

		MIKAKUTEI("0", "未出庫"),		// 0:未出庫
		KENPINTYU ("1", "出庫中"),		// 1:出庫中
		KAKUTEISUMI ("2", "出庫済");	// 2:出庫済

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KAKUTEIKBN_TSYKOHD(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 確定区分（出庫ファイル）
	 */
	public enum KAKUTEIKBN_TSYKOYN implements EnumBehaviour {

		MIKAKUTEI("0", "未確定"),		// 0:未確定
		KENPINTYU ("1", "検品中"),		// 1:検品中
		KAKUTEISUMI ("2", "確定済");	// 2:確定済

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KAKUTEIKBN_TSYKOYN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 店間理由コード（"Z"：新店手配）.
	 */
	public static final String TENNKANRIYU_SINTENTEHAI = "Z";

	/**
	 * セキュリティパターン（セキュリティマスタ）
	 */
	public enum SECU_PTTN implements EnumBehaviour {

		SHAIN("0", "社員用"),		//"0":社員用
		Arbeit ("1", "アルバイト用");	//"1"：アルバイト用

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private SECU_PTTN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 可否フラグ（セキュリティマスタ）
	 */
	public enum YN_FLG implements EnumBehaviour {

		NO("0", "否"),		//"0":否
		YES ("1", "可");		//"1"：可

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private YN_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}
	/**
	 * ファイル識別
	 */
	public enum FILE_IDT  {

		TSYKLBLID("1"),					//"1"：出荷ラベルＩＤ
		TATCSCMLBL("2");				//"2"：エリアＴＣＳＣＭラベル

		// 区分値
	    private String code;

	    // コンストラクター
	    private FILE_IDT(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}
	/**
	 * 検品フラグ区分(箱検品ファイル)
	 */
	public enum INSPECTFLG_KBN {
		KENPINMK("0"),				// "0":未検品
		KENPINKZ("1");				// "1":検品済

		// 区分値
	    private String code;

	    // コンストラクター
	    private INSPECTFLG_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 中継納品区分(箱検品ファイル)
	 */
	public enum CHUKEINOHINKBN implements EnumBehaviour {

		TENTYOKU("0", "店直"),		// "0":店直
		KEIYU ("1", "経由"),	//"1":経由
		SOUKONYUKA ("2", "倉庫入荷");		//"2":倉庫入荷

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private CHUKEINOHINKBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 受払区分（受払履歴ファイル）
	 */
	public enum UKEHARAI_KBN implements EnumBehaviour {

		URIAGE("01", "売上"),				//"01"（→売上）
		URIAGEHENPIN ("02", "売上返品"),	    //"02"（→売上返品）
		URIAGEMODOSI("03", "売上戻し"),		//"03"（→売上戻し）
		NYUKA ("04", "入荷"),				//"04"（→入荷）
		HENPIN("05", "返品"),				//"05"（→返品）
		SHUKO ("06", "出庫"),				//"06"（→出庫）
		NYUKO("07", "入庫"),				//"07"（→入庫）
		TEKYOSHUKO ("08", "撤去出庫"),		//"08"（→撤去出庫）
		HOKANMODOSI("09", "保管戻し"),		//"09"（→保管戻し）
		TEKYOKENPIN ("10", "撤去検品"),		//"10"（→撤去検品）
		SHOHINHAIKI("11", "商品廃棄"),		//"11"（→商品廃棄）
		KEIFURIKEI ("12", "経振（経）"),		//"12"（→経振経)
		KEIFURISHO("13", "経振（商）"),			//"13"（→経振商）
		TANAOROSISAI ("14", "棚卸差異"),		//"14"（→棚卸差異）
		ZAIKOTEISEI("15", "在庫訂正"),		//"15"（→在庫訂正）
		NYUKOSAI("16", "入庫差異");			//"16"（→入庫差異）

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private UKEHARAI_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 経由出庫区分（出荷ラベルＩＤファイル）
	 */
	public enum KEIYUSHUKO_KBN implements EnumBehaviour {

		KEIYU("1", "経由"),			//"1":経由
		SHUKO ("2", "出庫");		//"2"：出庫

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KEIYUSHUKO_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 店舗荷受フラグ（出荷ラベルＩＤファイル）
	 */
	public enum TENPONIUKE_FLG implements EnumBehaviour {

		MINIUKE("0", "未荷受"),			//"0":未荷受
		NIUKESUMI ("1", "荷受済"),		//"1"：荷受済
		NYUKOSUMI ("2", "入庫済");		//"2"：入庫済

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private TENPONIUKE_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 確定区分（箱検品ファイル）
	 */
	public enum KAKUTEIKBN_HAKOKENPIN implements EnumBehaviour {

		MINYUKA("0", "未入荷"),		//"0":未入荷
		KENPINTYU ("1", "検品中"),		//"1":検品中
		KAKUTEISUMI ("2", "確定済");	//"2":確定済

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KAKUTEIKBN_HAKOKENPIN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 検品フラグ（箱検品ファイル共有）
	 */
	public enum KENPIN_FLG implements EnumBehaviour {

		MIKENPIN("0", "未検品"),			//"0":未荷受
		KENPINSUMI ("1", "検品済");		//"1"：荷受済

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KENPIN_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 店舗荷受フラグ（箱検品ファイル）
	 */
	public enum TEMPONIUKE_FLG implements EnumBehaviour {

		MINIUKE("0", "未荷受"),			//"0":未荷受
		NIUKESUMI ("1", "荷受済");		//"1"：荷受済

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private TEMPONIUKE_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 可・不可フラグ（社員マスタメンテ用）
	 */
	public enum FKK_KBN implements EnumBehaviour {

		KA("0", "不可"),		//"0":不可
		FUKA ("1", "可");		//"1"：可

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private FKK_KBN(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 状態フラグ（受払履歴ファイル）（入荷）
	 */
	public enum JYOTAI_FLG implements EnumBehaviour  {

		MINYUKA("0", "未入荷"),			//"0":未入荷
		KENPINTYU("1", "検品中"),		//"1":検品中
		NYUKASUMI("2", "入荷済"),		//"2":入荷済
		SIIREKEIJO("3", "仕入計上");	//"3":仕入計上

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private JYOTAI_FLG(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 店舗着荷フラグ（分散入荷ファイル）
	 */
	public enum TEMPOCHAKKA_FLG implements EnumBehaviour  {

		MICHAKKA("0", "未着荷"),			//"0":未着荷
		CHAKKASUMI("1", "着荷済");		//"1":着荷済

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private TEMPOCHAKKA_FLG(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 確定区分（分散入荷ファイル）
	 */
	public enum KAKUTEIKBN_TBNYKA implements EnumBehaviour {

		MINYUKA("0", "未入荷"),		//"0":未入荷
		KENPINTYU ("1", "検品中"),		//"1":検品中
		KAKUTEISUMI ("2", "確定済");	//"2":確定済

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private KAKUTEIKBN_TBNYKA(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * ホスト登録識別（箱検品ファイル）
	 */
	public enum HOSTREG_IDT_THKPN  {

		MISAKUSEI("0"),	//"0":未登録
		SAKUSEISUMI("1");	//"1"：登録済

		// 区分値
	    private String code;

	    // コンストラクター
	    private HOSTREG_IDT_THKPN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 入荷方法区分（分散入荷ファイル）
	 */
	public enum NYUKAHOHO_TBNYKA implements EnumBehaviour  {

		TSUJO("1", "通常"),			//"1":通常
		KEIKA("2", "経過");		//"2":経過

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private NYUKAHOHO_TBNYKA(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 連番(00)
	 */
	public static final String RENBAN_00 = "00";

	/**
	 * 発注区分(発注返品依頼ファイル)
	 */
	public enum ORDER_KBN implements EnumBehaviour  {

		NORMAL("1", "本部通常"),			//1:本部通常
		HOJOTEIAN("2", "補充提案"),			//2:補充提案
		KYAKUTYU("3", "客注"),				//3:客注
		HOJOHATYU("4", "補充発注"),			//4:補充発注
		TYUKOHIN("5", "中古品"),			//5:中古品
		TENPO_NORMAL("6", "店舗通常"),			//6:店舗通常
		TENPOKANKOKU_AUTO("7", "自動発注店舗勧告");	//7:自動発注店舗勧告

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private ORDER_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * オンライン区分(発注返品依頼ファイル)
	 */
	public enum ONLINE_KBN implements EnumBehaviour  {


		SOUSIN("1", "送信"),				//1:送信
		FUTUYUBIN("2", "普通郵便"),			//2:普通郵便
		SOTATU("3", "速達"),				//3:速達
		UNSOUMOTO("4", "運送元"),			//4:運送元
		UNSOUTYAKU("5", "運送着"),			//5:運送着
		FAX("6", "ＦＡＸ"),					//6:ＦＡＸ
		HAND("7", "ハンド");				//7:ハンド

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private ONLINE_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 許可フラグ(発注返品依頼ファイル)
	 */
	public enum KYOKA_FLG implements EnumBehaviour  {


		KYOKA_SINAI("0", "否"),		//0:許可しない
		KYOKA_SURU("1", "可");		//1：許可

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private KYOKA_FLG(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 注文書発行フラグ(発注返品依頼ファイル)
	 */
	public enum ORDERHAKKO_FLG implements EnumBehaviour  {


		MIHAKKO("0", "未発行"),			//0:未発行
		HAKKOZUMI("1", "発行済");		//1:発行済

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private ORDERHAKKO_FLG(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 発注許可フラグ(発注返品依頼ファイル)
	 */
	public enum ORDERPRM_FLG implements EnumBehaviour  {

		ORDERPRMSINAI("0", "許可しない"),	//0:許可しない
		ORDERPRM("1", "許可");		        //1:許可

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private ORDERPRM_FLG(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}
		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 別葉区分(発注返品依頼ファイル)
	 */
	public enum BETSUYO_KBN implements EnumBehaviour  {


		BETSUYOMUSI("9", "別葉無し"),	//9:別葉無し
		IPPINICHIYO("8", "一品一葉");		        //8:一品一葉

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private BETSUYO_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 入出金データ使用フラグ（科目摘要マスタ）
	 */
	public enum NYUSHUTUKINDATA_FLG  {

		SIYO("1"),			//"1":使用
		SIYOSINAI("0");		//"0"：使用しない

		// 区分値
	    private String code;

	    // コンストラクター
	    private NYUSHUTUKINDATA_FLG(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 本社自他店区分(科目摘要マスタ)
	 */
	public enum HONSHAJITATENKBN implements EnumBehaviour  {

		JIMISE("1", "自店"),			//1:自店
		TAMISE("2", "他店"),		//2:他店
		HONMISE("3", "本店");			//3:本店

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private HONSHAJITATENKBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 本部店舗区分
	 */
	public enum HONBU_TENPO_KBN {

		TENPO("1"),		//"1"：店舗
		HONBU("2");		//"2"：本部

		// 区分値
	    private String code;

	    // コンストラクター
	    private HONBU_TENPO_KBN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 本社自他店区分(入出金日明細ファイル)
	 */
	public enum HONSHAJITATENKBN_TNSKND implements EnumBehaviour  {

		JIMISE("1", "自店"),			//1:自店
		TAMISE("2", "他店"),		//2:他店
		HONMISE("3", "本社");			//3:本社

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private HONSHAJITATENKBN_TNSKND(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 出庫理由コード(ユーザ自定義)
	 */
	public static final String  SHUKORIYUCODE_BYUSER = "90";

	/**
	 * 出庫理由コード(出庫理由マスタ)
	 */
	public enum SHUKORIYU_CODE implements EnumBehaviour  {

		TENPOTOROKU("91", "店舗登録"),			//91:店舗登録
		LOCOCHOC("94", "ロコチョク"),			//95:ロコチョク
		SOKOSHUKO("95", "倉庫出庫"),			//95:倉庫出庫
		KYAKUTYUHIKIATE("96", "客注引当"),		//96:客注引当
		SOKOKAISHU("97", "倉庫回収"),			//97:倉庫回収
		FURYOHINKAISHU("98", "不良品回収"),		//98:不良品回収
		SHINTENSYUKO("99", "新店出庫");			//99:新店出庫

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private SHUKORIYU_CODE(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 税区分(支払経費ファイル)
	 */
	public enum ZEI_KBN implements EnumBehaviour  {

		KAZEINASI("0", "不課税"),		//0:不課税
		NAIZEI("1", "内税"),			//1:内税
		GAIZEI("2", "外税"),			//2:外税
		YUUSHUTU("3", "輸出"),			//3:輸出
		HIKAZEI("4", "非課税");			//4:非課税

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private ZEI_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	/**
	 * 振替在庫区分(在庫振替履歴ファイル)
	 */
	public enum FURIKAE_ZAIKO_KBN implements EnumBehaviour  {

		HANBAIZAIKO("1", "販売在庫"),		//"1"：販売在庫
		TORIOKIZAIKO("2", "取置在庫"),		//"2"：取置在庫
		FURYOHINZAIKO("3", "不良在庫"),		//"3"：不良在庫
		SIDAHINZAIKO("4", "試打品在庫"),	//"4"：試打品在庫
		TEKYOTYUZAIKO("5", "撤去在庫");	//"5"：撤去中在庫

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private FURIKAE_ZAIKO_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}
	
	/**
	 * ACEブランドマスタ．PB扱い区分
	 */
	public enum PBKBN_FLG implements EnumBehaviour {

		NASI("0", "なし"),		//"0":なし
		ARI ("1", "あり"),		//"1"：あり
		NASI_K("0", "無"),	    //"0":無
		ARI_K("1", "有");		//"1"：有

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private PBKBN_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}
	/**
	 * ACEブランドマスタ．PB扱い区分
	 */
	public enum NBKBN_FLG implements EnumBehaviour {

		NASI("0", "なし"),			//"0":なし
		ARI ("1", "あり"),		//"1"：あり
		NASI_K("0", "無"),	    //"0":無
		ARI_K("1", "有");		//"1"：有

		// 区分値
	    private String code;
	    private String name;

	    // コンストラクター
	    private NBKBN_FLG(String _code, String _name) {
	        this.code = _code;
	        this.name = _name;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

		@Override
		public String getCode() {
			return this.code;
		}

		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * 訂正フラグ(在庫差異ファイル)
	 */
	public enum TEISEI_FLG implements EnumBehaviour  {

		NORMAL("0","通常"), 				//"0"：通常
		TEISEI("1", "訂正データ") ;		//"1"：訂正データ

		// 区分値
	    private String kubun;
	    private String kubunNm;

	    // コンストラクター
	    private TEISEI_FLG(String _kubun, String _kubunNm) {
	        this.kubun = _kubun;
	        this.kubunNm = _kubunNm;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.kubun;
	    }

		@Override
		public String getCode() {
			return this.kubun;
		}

		@Override
		public String getName() {
			return this.kubunNm;
		}

	}

	/**
	 * メンテナンス区分(Ｊ－ＳＯＸログファイル)
	 */
	public enum MNT_KBN_JSOX implements EnumBehaviour {

		INSERT("I", "INSERT"),			//"I"：INSERT
		UPDATE("U", "UPDATE"),			//"U"：UPDATE
		DELETE("D", "DELETEＥ");		//"D"：DELETEＥ

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private MNT_KBN_JSOX(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * レコード区分(Ｊ－ＳＯＸログファイル)
	 */
	public enum RECORD_KBN_JSOX implements EnumBehaviour {

		INSERT("0", "更新前"),			//"0"：更新前
		DELETE("1", "更新後");			//"1"：更新後

		// 区分値
	    private String code;
	    private String meisyo;

	    // コンストラクター
	    private RECORD_KBN_JSOX(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }

	    @Override
		public String getCode() {
			// コード取得
			return this.code;
		}
	    @Override
		public String getName() {
			// 名称取得
			return this.meisyo;
		}
	}

	/**
	 * 入荷識別（入庫ヘッダファイル）
	 */
	public enum NYUKA_IDT  {

		NYUKAIGAI("0"),		//"0":それ以外
		NYUKA ("1");		//"1"：入荷

		// 区分値
	    private String code;

	    // コンストラクター
	    private NYUKA_IDT(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * ホスト登録識別（入庫ファイル）
	 */
	public enum HOSTREG_IDT_TNYKOYN  {

		MITOROKU("0"),	//"0"：未登録
		TOROKU("1");	//"1"：登録

		// 区分値
	    private String code;

	    // コンストラクター
	    private HOSTREG_IDT_TNYKOYN(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * 積送中在庫更新識別
	 */
	public enum SEKISOCHU_ZAIKO_UPD_IDT  {

		MITOROKU("0"),	//"0"：未登録
		TOROKU("1");	//"1"：登録

		// 区分値
	    private String code;

	    // コンストラクター
	    private SEKISOCHU_ZAIKO_UPD_IDT(String _code) {
	        this.code = _code;
	    }

	    //値を返却する
	    @Override
	    public String toString() {
	        return this.code;
	    }
	}

	/**
	 * CSV出力の判定値
	 */
	public enum OUTPUT_CSV_FLG {

		EQUAL_ZERO("0"),		//"0":出力件数ゼロ
		NO_ERROR("1"),			//"1":問題なし
		OVER_10THOUSAND("2"),	//"2":1万件超え
		OVER_50THOUSAND("3");	//"3":5万件超え

		// コード
	    private String code;

	    // コンストラクター
	    private OUTPUT_CSV_FLG(String _code) {
	        this.code = _code;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}
	}

	/**
	 * 売価変更ファイルの割引区分、セット割引区分用
	 */
	public enum WARIKBN_KBN implements EnumBehaviour  {

		WARIBIKIRITU("1", "割引率売変"),      //"1"：割引率売変
		KANGENRITU("2", "還元率売変"),      //"2"：還元率売変
		KINGAKUHIKI("3", "金額引き売変"),   //"3"：金額引き売変
		ZUBARI("4", "ズバリ売変");          //"4"：ズバリ売変

		// コード
	    private String code;
		// 名称
	    private String meisyo;

	    // コンストラクター
	    private WARIKBN_KBN(String _code, String _meisyo) {
	        this.code = _code;
	        this.meisyo = _meisyo;
	    }

		@Override
		public String toString() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getCode() {
			// コードを返却する
			return this.code;
		}

		@Override
		public String getName() {
			// 名称を返却する
			return this.meisyo;
		}
	}

	//*************************DB定数定義領域　END*********************

	//*************************字符定数定義領域　START*****************
	
	/**
	 * 斜線.
	 */
	public static final String SYASEN = "/";

	/**
	 * コロン.
	 */
	public static final String KORON = ":";

	/**
	 * "*"
	 */
	public static final String HOUXI = "*";

	/**
	 * "＊"
	 */
	public static final String HOUXI_ZENKAKU = "＊";

	/**
	 * ","
	 */
	public static final String CONMA = ",";

	/**
	 * "〒"
	 */
	public static final String YUBIN = "〒";

	/**
	 * 文字列ゼロ.
	 */
	public static final String STRING_ZERO = "0";

	/**
	 * 文字列９.
	 */
	public static final String STRING_NINE = "9";

	/**
	 * BigDecimalの数字ゼロ
	 */
	public static final BigDecimal BIGDECIMAL_ZERO = BigDecimal.ZERO;

	/**
	 * longの数字ゼロ
	 */
	public static final long LONG_ZERO = 0;

	/**
	 * Integerの数字ゼロ
	 */
	public static final Integer INTEGER_ZERO = 0;

	/**
	 * 文字列ゼロゼロ.
	 */
	public static final String STRING_ZEROZERO = "00";

	/**
	 * 半角スペース.
	 */
	public static final String HANKAKU_SUPESU = " ";

	/**
	 * 税率.
	 */
	public static final Integer ZEIRITSU = 10000;

	/**
	 * アンダーバー.
	 */
	public static final String UNDERBAR = "_";

	/**
	 * 括弧"[".
	 */
	public static final String KAKO_HIDARI = "[";

	/**
	 * 括弧"]".
	 */
	public static final String KAKO_MIGI = "]";

	/**
	 * ハイフン.
	 */
	public static final String HAIFUN = "-";

	/**
	 * 文字"週".
	 */
	public static final String WEEK = "週";

	/**
	 * 日付ALLゼロ編集.
	 */
	public static final String DATE_ZERO = "00000000";

	/**
	 * 年月ALLゼロ編集.
	 */
	public static final String YEAR_MONTH_ZERO = "000000";

	/**
	 * 年ALLゼロ編集.
	 */
	public static final String YEAR_ZERO = "0000";

	/**
	 * 月ALLゼロ編集.
	 */
	public static final String MONTH_ZERO = "00";

	/**
	 * 日ALLゼロ編集.
	 */
	public static final String DAY_ZERO = "00";

	/**
	 * 時刻ALLゼロ編集.
	 */
	public static final String TIME_ZERO = "000000";
	//*************************字符定数定義領域　END****************

	//***********ドロップダウンリスト取得用定数定義領域　START******

	/**
	 * 有れば、追加する予定
	 */

	//***********ドロップダウンリスト用定数定義領域　END************


	//*************************その他定数定義領域　START************
	/**
	 * Templateファイルパス
	 */
	public static final String tempFilePath = "/WEB-INF/template/jrxml/";
	/**
	 * APPLICATION_PDF.
	 */
	public static final String APPLICATION_PDF = "application/pdf";

	/**
	 * APPLICATION_PDF.
	 */
	public static final String CONTENT_DISPOTION = "Content-disposition";

	/**
	 * APPLICATION_PDF.
	 */
	public static final String ATTACH_FILE = "attachment;filename=";

	/**
	 * RESPONSE_ENCODE.
	 */
	public static final String RESPONSE_ENCODE = "UTF-8";

	/**
	 * 処理モード：検索.
	 */
	public static final String SEARCH_MODE = "S";

	/**
	 * バッチ更新者コード
	 */
	public static final String UPD_BT_USER_CD = "999999";

	/**
	 * バッチ更新者名
	 */
	public static final String UPD_BT_USER_NM = "情報更新用";

	//*************************その他定数定義領域　END**************

	//*************暗号化・復号化用定数定義領域　START**************
	/**
	 * UserID 組み換え用変数(復号化用)
	 * (n番目の文字列の組み換え後の位置を格納する)
	 */
	public static final int[] RECOMB_USERID_DEC = new int[]{ 4, 2, 0, 5, 3, 1 };

	/**
	 * Password 組み換え用変数(復号化用)
	 * (n番目の文字列の組み換え後の位置を格納する)
	 */
	public static final int[] RECOMB_PW_DEC = new int[]{ 7, 3, 5, 9, 0, 4, 1, 8, 2, 6 };

	/**
	 * 暗号化・復号化種別( ユーザーID )
	 */
	public static final int ENCRYPT_SBT_USERID = 0;

	/**
	 * 暗号化・復号化種別( パスワード )
	 */
	public static final int ENCRYPT_SBT_PW = 1;

	/**
	 * key1 を暗号化する際に使用する salt値
	 */
	public static final int KEY1_SALT = 16;

	/**
	 * key2 を暗号化する際に使用する salt値
	 */
	public static final int KEY2_SALT = 15;

	/**
	 * 文字コード ASCII
	 */
	public static final String ENCODE_ASCII = "US-ASCII";

	/**
	 * 部署コードが"0000"(名称なし)
	 */
	public static final String DEPTCD_0000 = "0000";

	//*************暗号化・復号化用定数定義領域　END****************

}
