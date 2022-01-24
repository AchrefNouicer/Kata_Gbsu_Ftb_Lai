import {Component, OnDestroy, OnInit} from '@angular/core';
import {GbsuFtbLaiService} from '../gbsu-ftb-lai.service';
import {take} from 'rxjs/operators';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {
  convertedValues: NumberConverted[] = [];

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) {
  }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.gbsuFtbLaiService.convertNumber(+inputNumber)
      .pipe(take(1))
      .subscribe(convertedValue => this.convertedValues.push({
        numberToConvert: inputNumber,
        result: convertedValue.result
      }));
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
