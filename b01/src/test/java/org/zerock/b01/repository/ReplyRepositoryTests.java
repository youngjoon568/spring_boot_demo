package org.zerock.b01.repository;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.b01.domain.Board;
import org.zerock.b01.domain.Reply;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;

@SpringBootTest
@Log4j2
public class ReplyRepositoryTests {

    @Autowired
    private ReplyRepository replyRepository;

    @Test
    public void testInsert() {
        Long bno = 100L;

        Board board = Board.builder().bno(bno).build();
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Reply reply = Reply.builder().board(board).replyText("댓글 테스트1......" + i).replyer("replyer" + i).build();
            
            replyRepository.save(reply);
        });
    }

    @Test
    public void testBoardReplies() {
        Long rno = 208L;

        Pageable pageable = PageRequest.of(0, 10, Sort.by("rno").descending());
    }
}