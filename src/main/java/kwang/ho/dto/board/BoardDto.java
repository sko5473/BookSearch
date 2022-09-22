package kwang.ho.dto.board;

import lombok.Data;

import java.util.List;

@Data
public class BoardDto {
    private int bid;
    // 원글 번호
    private int bid_Parent;
    private String title;
    private String contents;
    // 조회수
    private int hit_Cnt;
    private String creator_Id;
    private String created_Datetime;
    private String updater_Id;
    private String updated_Datetime;
    // 답글 순서
    private int reply_Step;
    // 답글 레벨
    private int reply_Level;

    /** 파일 변경 여부 */
    private String changeYn;

    /** 파일 인덱스 리스트 */
    private List<Long> fileIdxs;

}
