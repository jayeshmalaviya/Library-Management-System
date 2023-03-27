package com.SpringProject.librarymanagementsystem.Entity;

import com.SpringProject.librarymanagementsystem.Enum.TransactionStatus;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue (strategy = GenerationType .IDENTITY)
    int id;

    private String transactionNumber;

    @Enumerated(EnumType .STRING)
    TransactionStatus  transactionStatus;

    @CreationTimestamp
    private Date  transactionDate;

    private boolean isIssueOperation;

    private String message;

    @ManyToOne
    @JoinColumn
    Book book;

    @ManyToOne
    @JoinColumn
    LibraryCard card;

}
