package kwang.ho.service.book;

import kwang.ho.dto.board.PagingVO;
import kwang.ho.dto.book.BookAttachDto;
import kwang.ho.dto.book.BookDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BookService {

    // 도서게시글 목록
    List<BookDto> selectBookListWithPaging(PagingVO pagingVO) throws Exception;

    // 도서게시글 상세보기
    BookAttachDto selectBookDetail(int bid) throws Exception;

    // 도서게시글 등록
    boolean insertBook(BookDto bookDto, MultipartFile[] files) throws Exception;

    // 도서게시글 삭제
    void bookDelete(int bid) throws Exception;

    // 도서게시글 수정페이지 호출
    BookDto selectOpenBookModify(int bid) throws Exception;

    // 도서게시글 수정
    void bookModify(BookDto bookDto) throws Exception;

    // 도서게시글 갯수
    int selectBookTotalCount() throws Exception;

}
