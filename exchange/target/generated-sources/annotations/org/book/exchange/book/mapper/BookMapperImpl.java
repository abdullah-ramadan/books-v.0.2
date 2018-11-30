package org.book.exchange.book.mapper;

import javax.annotation.Generated;
import org.book.exchange.book.domain.Book;
import org.book.exchange.book.dto.BookDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-11-30T22:18:25+0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toBook(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( bookDto.getId() );
        book.setName( bookDto.getName() );
        book.setAliasName( bookDto.getAliasName() );
        book.setDescription( bookDto.getDescription() );
        book.setPublishDate( bookDto.getPublishDate() );

        return book;
    }

    @Override
    public BookDto toBookDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( book.getId() );
        bookDto.setName( book.getName() );
        bookDto.setAliasName( book.getAliasName() );
        bookDto.setDescription( book.getDescription() );
        bookDto.setPublishDate( book.getPublishDate() );

        return bookDto;
    }
}
