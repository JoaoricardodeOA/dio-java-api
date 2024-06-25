# dio-java-api
An api to simulate features used in DIO website

Based on this image 
![image](https://github.com/JoaoricardodeOA/dio-java-api/assets/83128494/d40dca2b-5a08-447b-a986-bbaaadc7e866)
I made this JSON

```json
{
  "name":"xxxxx",
  "account":[
    {
      "ProfileImage":"",
      "level":0,
      "career":"xxx",
      "XP":133,
      "habilities":0,
      "projects":0,
      "technologyIcons":[
        {
          "icon":"url"
        }
      ]
    }
  ],
  "educationRecommendations":[
    {
      "icon":"",
      "description":""
    }
  ],
  "projectRecommendations":[
    {
      "icon":"",
      "description":"",
      "technology":""
    }
  ]
}
```
## Class Diagram - using ChatGpt to help
```mermaid
classDiagram
  class User {
    - name: string
    - account: Account[]
    - educationRecommendations: EducationRecommendation[]
    - projectRecommendations: ProjectRecommendation[]
  }
  
  class Account {
    - ProfileImage: string
    - level: number
    - career: string
    - XP: number
    - habilities: number
    - projects: number
    - technologyIcons: TechnologyIcon[]
  }
  
  class TechnologyIcon {
    - icon: string
  }
  
  class EducationRecommendation {
    - icon: string
    - description: string
  }
  
  class ProjectRecommendation {
    - icon: string
    - description: string
    - technology: string
  }
  
  User "1" --> "1" Account : has
  Account "1" --> "N" TechnologyIcon : has
  User "1" --> "N" EducationRecommendation : has
  User "1" --> "N" ProjectRecommendation : has
  ```
