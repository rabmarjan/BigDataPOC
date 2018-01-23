package com.secl.marjan.univerge;

import lombok.SneakyThrows;
import org.apache.hadoop.fs.FsShell;
import org.apache.spark.sql.SparkSession;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.social.linkedin.api.Job;

@SpringBootApplication
@EnableBatchProcessing
public class UnivergeApplication{
//    @Autowired
//    FsShell shell;
//    @Autowired
//    JobLauncher jobLauncher;
//    @Autowired
//    Job tweetTopHashtagsl;
    public static void main(String[] args) {
        SpringApplication.run(UnivergeApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        SparkSession sparkSession = SparkSession.
//                builder().
//                appName("univergeAnalytics").
//                master("local").
//                getOrCreate();
//        System.out.println("Spark version: " + sparkSession.version());
//    }

}
