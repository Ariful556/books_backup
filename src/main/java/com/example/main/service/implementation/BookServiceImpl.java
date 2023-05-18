//package com.example.main.service.implementation;
//
//import com.example.main.service.BookService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//
//public class BookServiceImpl implements BookService {
//    public ResponseEntity<Object> getAllBooks() {
//        List<Book> BookList = bookRepository.findAll();
//        List<BookResponseModel> responseList = new ArrayList<>();
//        for (Book book : BookList) {
//            BookResponseModel bookResponseModel = BookResponseModel.builder()
//                    .bookId(book.getBookId())
//                    .bookName(book.getBookName())
//                    .authorName(book.getAuthorName())
//                    .price(book.getPrice())
//                    .quantity(book.getQuantity())
//                    .build();
//            responseList.add(bookResponseModel);
//        }
//        return new ResponseEntity<>(responseList, HttpStatus.OK);
//    }
//}
