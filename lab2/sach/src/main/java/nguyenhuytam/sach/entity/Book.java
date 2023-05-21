package nguyenhuytam.sach.entity;

import lombok.Data;

@Data
public class Book {
    private Long id;

    private String title;
    private String author;
    private Double price;
    private String category;
}
