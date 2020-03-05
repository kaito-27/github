SELECT SUM(circulation) 発行部数, name 出版社
FROM manga_tbl m
LEFT JOIN company_tbl c ON m.company_id = c.id
GROUP BY m.company_id

